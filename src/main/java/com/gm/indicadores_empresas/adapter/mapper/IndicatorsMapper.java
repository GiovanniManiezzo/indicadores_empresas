package com.gm.indicadores_empresas.adapter.mapper;

import com.gm.indicadores_empresas.adapter.out.jpa.IndicatorsJpaEntity;
import com.gm.indicadores_empresas.application.domain.Indicators;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IndicatorsMapper {

    @Mappings({
            @Mapping(source = "quarter",                target = "quarter"),
            @Mapping(source = "costOfGoodsSold",          target = "costOfGoodsSold"),
            @Mapping(source = "operatingIncomeExpense",  target = "operatingIncomeExpense"),
            @Mapping(source = "incomeTax",               target = "incomeTax"),
            @Mapping(source = "consolidatedNetIncome",   target = "consolidatedNetIncome"),
            @Mapping(source = "salesRevenue",            target = "salesRevenue"),
            @Mapping(source = "ebit",                    target = "ebit"),
            @Mapping(source = "preTaxIncome",            target = "preTaxIncome"),
            @Mapping(source = "grossProfit",             target = "grossProfit"),
            @Mapping(source = "financialResult",         target = "financialResult"),
            @Mapping(source = "netIncomeOperation",      target = "netIncomeOperation")
    })
    Indicators toModel(IndicatorsJpaEntity indicatorsJpaEntity);

    IndicatorsJpaEntity toEntity(Indicators indicators);
}
