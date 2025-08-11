package com.gm.indicadores_empresas.adapter.out.jpa;

import com.gm.indicadores_empresas.application.domain.Company;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "indicators")
@IdClass(IndicatorsId.class)
public class IndicatorsJpaEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    private CompanyJpaEntity company;

    @Id
    @Column(name = "quarter")
    private LocalDate quarter;

    @Column(name = "cost_of_goods_sold")
    private BigDecimal costOfGoodsSold;

    @Column(name = "operating_income_expense")
    private BigDecimal operatingIncomeExpense;

    @Column(name = "income_tax")
    private BigDecimal incomeTax;

    @Column(name = "consolidated_net_income")
    private BigDecimal consolidatedNetIncome;

    @Column(name = "sales_revenue")
    private BigDecimal salesRevenue;

    @Column(name = "ebit")
    private BigDecimal ebit;

    @Column(name = "pre_tax_income")
    private BigDecimal preTaxIncome;

    @Column(name = "gross_profit")
    private BigDecimal grossProfit;

    @Column(name = "financial_result")
    private BigDecimal financialResult;

    @Column(name = "net_income_operation")
    private BigDecimal netIncomeOperation;

    @Column(name = "hmanut")
    private LocalDateTime hmanut;

    public IndicatorsJpaEntity() {}

    public IndicatorsJpaEntity(CompanyJpaEntity company){
        this.company = company;
        this.quarter = quarter;
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

    public BigDecimal getEbit() {
        return ebit;
    }

    public void setEbit(BigDecimal ebit) {
        this.ebit = ebit;
    }

    public BigDecimal getPreTaxIncome() {
        return preTaxIncome;
    }

    public void setPreTaxIncome(BigDecimal preTaxIncome) {
        this.preTaxIncome = preTaxIncome;
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

    public LocalDate getQuarter() {
        return quarter;
    }

    public void setQuarter(LocalDate quarter) {
        this.quarter = quarter;
    }

    public LocalDateTime getHmanut() {
        return hmanut;
    }

    public void setHmanut(LocalDateTime hmanut) {
        this.hmanut = hmanut;
    }

    public CompanyJpaEntity getCompany() {
        return company;
    }

    public void setCompany(CompanyJpaEntity company) {
        this.company = company;
    }
}