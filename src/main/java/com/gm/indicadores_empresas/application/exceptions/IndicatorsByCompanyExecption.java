package com.gm.indicadores_empresas.application.exceptions;

public class IndicatorsByCompanyExecption extends Exception {

    public IndicatorsByCompanyExecption(String message) {
        super(message);
    }

    public IndicatorsByCompanyExecption(String message, Throwable cause) {
        super(message, cause);
    }
}
