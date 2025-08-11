package com.gm.indicadores_empresas.application.domain;

public class Company{

    private int id;
    private String name;
    private String ticker;
    private String sector;

    public Company(){}

    public Company(int id, String name, String ticker, String sector) {
        this.id = id;
        this.name = name;
        this.ticker = ticker;
        this.sector = sector;
    }

    public Company(String name, String ticker) {
        this.name = name;
        this.ticker = ticker;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
