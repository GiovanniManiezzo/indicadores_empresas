package com.gm.indicadores_empresas.adapter.out.jpa;

import com.gm.indicadores_empresas.adapter.mapper.IndicatorsMapper;
import com.gm.indicadores_empresas.adapter.repository.IndicatorsRepository;
import com.gm.indicadores_empresas.application.domain.Indicators;
import com.gm.indicadores_empresas.application.port.out.SearchIndicatorsPort;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class CompanyPersistence implements SearchIndicatorsPort {

    private final IndicatorsRepository indicatorsRepository;
    private final IndicatorsMapper indicadoresMapper;

    public CompanyPersistence(IndicatorsRepository indicatorsRepository, IndicatorsMapper indicadoresMapper) {

        this.indicatorsRepository = indicatorsRepository;
        this.indicadoresMapper = indicadoresMapper;

    }

    @Override
    public List<Indicators> searchIndicators(Indicators indicators) {
        return indicatorsRepository.findAllByCompany_Ticker(indicators.getCompany().getTicker())
                .stream()
                .map(indicadoresMapper::toModel)
                .toList();
    }
}
