package com.gm.indicadores_empresas.adapter.out.jpa;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "companies")
public class CompanyJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id", nullable = false, unique = true)
    private Long companyId;

    @Column(name = "cd_cvm", nullable = false, unique = true)
    private Long cd_cvm;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "ticker",nullable = false)
    private String ticker;

    @Column(name = "sector")
    private String sector;

    @Column(nullable = false)
    private LocalDateTime hmanut;

    public CompanyJpaEntity() {}

    public CompanyJpaEntity(String ticker){
        this.ticker = ticker;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCdCvm() {
        return cd_cvm;
    }

    public String getSector() { return sector; }

    public Long getCd_cvm() {
        return cd_cvm;
    }

    public void setCd_cvm(Long cd_cvm) {
        this.cd_cvm = cd_cvm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public LocalDateTime getHmanut() {
        return hmanut;
    }

    public void setHmanut(LocalDateTime hmanut) {
        this.hmanut = hmanut;
    }
}
