package com.gm.indicadores_empresas.adapter.in.web;

import com.gm.indicadores_empresas.adapter.in.dto.IndicatorsByCompanyDTO;
import com.gm.indicadores_empresas.adapter.in.dto.IndicatorsDTO;
import com.gm.indicadores_empresas.application.domain.Company;
import com.gm.indicadores_empresas.application.exceptions.IndicatorsByCompanyExecption;
import com.gm.indicadores_empresas.application.port.in.CompanyUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CompanyController {

    private final CompanyUseCase companyUseCase;

    @Autowired
    public CompanyController(CompanyUseCase companyUseCase) {
        this.companyUseCase = companyUseCase;
    }

    @PostMapping("companies/indicators")
    public ResponseEntity<List<IndicatorsDTO>> getIndicatorsByCompany(
            @RequestBody IndicatorsByCompanyDTO request) {

        Company company = new Company(request.name(), request.ticker());

        try{

            List<IndicatorsDTO> indicators = companyUseCase.getIndicatorsByCompany(company.getTicker());
            return ResponseEntity.ok(indicators);

        } catch (IndicatorsByCompanyExecption e){
            return ResponseEntity.badRequest().build();
        }
    }
}
