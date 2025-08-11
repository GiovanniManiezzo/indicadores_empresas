package com.gm.indicadores_empresas.application.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Indicators {

    private Company company;
    private LocalDate quarter;
    private BigDecimal costOfGoodsSold;
    private BigDecimal operatingIncomeExpense;
    private BigDecimal incomeTax;
    private BigDecimal consolidatedNetIncome;
    private BigDecimal salesRevenue;
    private BigDecimal ebit;
    private BigDecimal preTaxIncome;
    private BigDecimal grossProfit;
    private BigDecimal financialResult;
    private BigDecimal netIncomeOperation;

    public Indicators() {}

    public Indicators(Company company) {
        this.company = company;
    }

    public Indicators(Company company, LocalDate quarter) {
        this.company = company;
        this.quarter = quarter;
    }

    public Indicators(Company company, LocalDate quarter, BigDecimal costOfGoodsSold, BigDecimal operatingIncomeExpense, BigDecimal incomeTax,
                       BigDecimal consolidatedNetIncome, BigDecimal salesRevenue, BigDecimal ebit,
                       BigDecimal preTaxIncome, BigDecimal grossProfit, BigDecimal financialResult,
                       BigDecimal netIncomeOperation) {
        this.company = company;
        this.quarter = quarter;
        this.costOfGoodsSold = costOfGoodsSold;
        this.operatingIncomeExpense = operatingIncomeExpense;
        this.incomeTax = incomeTax;
        this.consolidatedNetIncome = consolidatedNetIncome;
        this.salesRevenue = salesRevenue;
        this.ebit = ebit;
        this.preTaxIncome = preTaxIncome;
        this.grossProfit = grossProfit;
        this.financialResult = financialResult;
        this.netIncomeOperation = netIncomeOperation;
    }

    public BigDecimal getCostOfGoodsSold() {
        return costOfGoodsSold;
    }

    public void setCostOfGoodsSold(BigDecimal costOfGoodsSold) {
        this.costOfGoodsSold = costOfGoodsSold;
    }

    public BigDecimal getOperatingIncomeExpense() {
        return operatingIncomeExpense;
    }

    public void setOperatingIncomeExpense(BigDecimal operatingIncomeExpense) {
        this.operatingIncomeExpense = operatingIncomeExpense;
    }

    public BigDecimal getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(BigDecimal incomeTax) {
        this.incomeTax = incomeTax;
    }

    public BigDecimal getConsolidatedNetIncome() {
        return consolidatedNetIncome;
    }

    public void setConsolidatedNetIncome(BigDecimal consolidatedNetIncome) {
        this.consolidatedNetIncome = consolidatedNetIncome;
    }

    public BigDecimal getSalesRevenue() {
        return salesRevenue;
    }

    public void setSalesRevenue(BigDecimal salesRevenue) {
        this.salesRevenue = salesRevenue;
    }

    public BigDecimal getPreTaxIncome() {
        return preTaxIncome;
    }

    public void setPreTaxIncome(BigDecimal preTaxIncome) {
        this.preTaxIncome = preTaxIncome;
    }

    public BigDecimal getEbit() {
        return ebit;
    }

    public void setEbit(BigDecimal ebit) {
        this.ebit = ebit;
    }

    public BigDecimal getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(BigDecimal grossProfit) {
        this.grossProfit = grossProfit;
    }

    public BigDecimal getFinancialResult() {
        return financialResult;
    }

    public void setFinancialResult(BigDecimal financialResult) {
        this.financialResult = financialResult;
    }

    public BigDecimal getNetIncomeOperation() {
        return netIncomeOperation;
    }

    public void setNetIncomeOperation(BigDecimal netIncomeOperation) {
        this.netIncomeOperation = netIncomeOperation;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public LocalDate getQuarter() {
        return quarter;
    }

    public void setQuarter(LocalDate quarter) {
        this.quarter = quarter;
    }

}

