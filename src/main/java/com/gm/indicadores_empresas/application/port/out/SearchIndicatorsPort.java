package com.gm.indicadores_empresas.application.port.out;

import com.gm.indicadores_empresas.application.domain.Company;
import com.gm.indicadores_empresas.application.domain.Indicators;

import java.util.Optional;

public interface SearchIndicatorsPort {

    /**
     * Searches for indicators based on the provided search criteria.
     *
     * @param company the criteria to search indicators
     * @return a list of indicators that match the search criteria
     */
    Optional<Indicators> searchIndicators(Indicators indicators);
}
