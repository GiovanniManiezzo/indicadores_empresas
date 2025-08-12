package com.gm.indicadores_empresas.application.port.in;

import com.gm.indicadores_empresas.adapter.in.dto.IndicatorsDTO;
import com.gm.indicadores_empresas.application.domain.Indicators;
import com.gm.indicadores_empresas.application.exceptions.IndicatorsByCompanyExecption;

import java.util.List;

public interface CompanyUseCase {

    List<Indicators> getIndicatorsByCompany(String ticker)
            throws IndicatorsByCompanyExecption;
}
