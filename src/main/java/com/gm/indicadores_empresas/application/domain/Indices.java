package com.gm.indicadores_empresas.application.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Indices {

    private LocalDate quarter;
    private BigDecimal ipca;
    private BigDecimal igpm;
    private BigDecimal incc;
    private BigDecimal ibov;
    private BigDecimal selic;
    private BigDecimal cdi;

    public Indices() {
    }

    public Indices(BigDecimal ipca, BigDecimal igpm, BigDecimal incc, BigDecimal ibov,
                   BigDecimal selic, BigDecimal cdi, LocalDate quarter) {
        this.quarter = quarter; // Default to current date
        this.ipca = ipca;
        this.igpm = igpm;
        this.incc = incc;
        this.ibov = ibov;
        this.selic = selic;
        this.cdi = cdi;
    }

    public BigDecimal getIpca() {
        return ipca;
    }

    public void setIpca(BigDecimal ipca) {
        this.ipca = ipca;
    }

    public BigDecimal getIgpm() {
        return igpm;
    }

    public void setIgpm(BigDecimal igpm) {
        this.igpm = igpm;
    }

    public BigDecimal getIncc() {
        return incc;
    }

    public void setIncc(BigDecimal incc) {
        this.incc = incc;
    }

    public BigDecimal getIbov() {
        return ibov;
    }

    public void setIbov(BigDecimal ibov) {
        this.ibov = ibov;
    }

    public BigDecimal getSelic() {
        return selic;
    }

    public void setSelic(BigDecimal selic) {
        this.selic = selic;
    }

    public BigDecimal getCdi() {
        return cdi;
    }

    public void setCdi(BigDecimal cdi) {
        this.cdi = cdi;
    }

    public LocalDate getQuarter() { return quarter; }

    public void setQuarter(LocalDate quarter) { this.quarter = quarter;}
}