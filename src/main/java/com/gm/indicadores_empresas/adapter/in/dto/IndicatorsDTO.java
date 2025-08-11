package com.gm.indicadores_empresas.adapter.in.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record IndicatorsDTO(
        LocalDate quarter,
        BigDecimal costOfGoodsSold,
        BigDecimal operatingIncomeExpense,
        BigDecimal incomeTax,
        BigDecimal consolidatedNetIncome,
        BigDecimal salesRevenue,
        BigDecimal ebit,
        BigDecimal preTaxIncome,
        BigDecimal grossProfit,
        BigDecimal financialResult,
        BigDecimal netIncomeOperation
) {
}
