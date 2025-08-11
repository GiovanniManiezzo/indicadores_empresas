package com.gm.indicadores_empresas.adapter.out.jpa;

import java.io.Serializable;
import java.time.LocalDate;

public class IndicatorsId implements Serializable {

    private Long company;
    private LocalDate quarter;

    public IndicatorsId() {}

    public IndicatorsId(Long company, LocalDate quarter) {
        this.company = company;
        this.quarter = quarter;
    }

    public LocalDate getQuarter() {
        return quarter;
    }

    public void setQuarter(LocalDate quarter) {
        this.quarter = quarter;
    }

    public Long getCompany() {
        return company;
    }

    public void setCompany(Long company) {
        this.company = company;
    }
}
