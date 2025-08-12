package com.gm.indicadores_empresas.adapter.in.web;

import com.gm.indicadores_empresas.adapter.in.dto.IndicatorsByCompanyDTO;
import com.gm.indicadores_empresas.adapter.in.dto.IndicatorsDTO;
import com.gm.indicadores_empresas.adapter.mapper.IndicatorsMapper;
import com.gm.indicadores_empresas.application.domain.Company;
import com.gm.indicadores_empresas.application.domain.Indicators;
import com.gm.indicadores_empresas.application.exceptions.IndicatorsByCompanyExecption;
import com.gm.indicadores_empresas.application.port.in.CompanyUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CompanyController {

    private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);

    private final CompanyUseCase companyUseCase;
    private final IndicatorsMapper indicatorsMapper;

    @Autowired
    public CompanyController(CompanyUseCase companyUseCase, IndicatorsMapper indicatorsMapper) {
        this.indicatorsMapper  = indicatorsMapper;
        this.companyUseCase = companyUseCase;
    }

    @PostMapping("companies/indicators")
    public ResponseEntity<List<IndicatorsDTO>> getIndicatorsByCompany(
            @RequestBody IndicatorsByCompanyDTO request) {

        logger.info("Received request to get indicators for company name: {} and ticker: {}", request.name(), request.ticker());
        Company company = new Company(request.name(), request.ticker());

        try {
            List<Indicators> indicators = companyUseCase.getIndicatorsByCompany(company.getTicker());

            List<IndicatorsDTO> indicatorsDTOS = indicators.stream()
                    .map(indicatorsMapper::toDto)
                    .toList();

            logger.info("Retrieved {} indicators for ticker: {}", indicators.size(), company.getTicker());
            return ResponseEntity.ok(indicatorsDTOS);

        } catch (IndicatorsByCompanyExecption e) {
            logger.error("Failed to retrieve indicators for ticker: {}", company.getTicker(), e);
            return ResponseEntity.badRequest().build();
        }
    }
}
