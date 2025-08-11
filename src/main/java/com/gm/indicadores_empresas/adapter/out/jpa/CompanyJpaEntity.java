package com.gm.indicadores_empresas.adapter.out.jpa;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "companies")
public class CompanyJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long cd_cvm;

    @Column(nullable = false, unique = true)
    private String ticker;

    @Column(nullable = false)
    private String sector;

    @Column(nullable = false)
    private LocalDateTime hmanut;

    public CompanyJpaEntity() {}

    public CompanyJpaEntity(String ticker){
        this.ticker = ticker;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCdCvm() {
        return cd_cvm;
    }

    public String getSector() { return sector; }

}
