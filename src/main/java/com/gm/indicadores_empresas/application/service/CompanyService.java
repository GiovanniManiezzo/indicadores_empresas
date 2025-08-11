package com.gm.indicadores_empresas.application.service;

import com.gm.indicadores_empresas.adapter.in.dto.IndicatorsDTO;
import com.gm.indicadores_empresas.application.domain.Company;
import com.gm.indicadores_empresas.application.domain.Indicators;
import com.gm.indicadores_empresas.application.exceptions.IndicatorsByCompanyExecption;
import com.gm.indicadores_empresas.application.port.in.CompanyUseCase;
import com.gm.indicadores_empresas.application.port.out.SearchIndicatorsPort;
import com.gm.indicadores_empresas.application.domain.Indicators;

import java.util.Optional;
import java.util.List;

public class CompanyService implements CompanyUseCase {

    private final SearchIndicatorsPort searchIndicatorsPortJpa;

    public CompanyService(SearchIndicatorsPort searchIndicatorsPortJpa) {
        this.searchIndicatorsPortJpa = searchIndicatorsPortJpa;
    }

    @Override
    public List<IndicatorsDTO> getIndicatorsByCompany(String ticker) throws IndicatorsByCompanyExecption {

        Company company = new Company("", ticker);
        Indicators indicatorsFilter = new Indicators(company);
        Optional<Indicators> indicators = searchIndicatorsPortJpa.searchIndicators(indicatorsFilter);

        if (indicators.isPresent()) {
            System.out.println("Indicators found for company: " + ticker);
        } else {
            throw new IndicatorsByCompanyExecption("No indicators found for company: " + ticker);
        }
        return List.of();
    }
}
