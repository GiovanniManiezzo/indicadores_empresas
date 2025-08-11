package com.gm.indicadores_empresas.config;

import com.gm.indicadores_empresas.IndicadoresEmpresasApplication;
import com.gm.indicadores_empresas.adapter.out.jpa.CompanyPersistence;
import com.gm.indicadores_empresas.application.port.in.CompanyUseCase;
import com.gm.indicadores_empresas.application.service.CompanyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = IndicadoresEmpresasApplication.class)
public class BeanConfiguration {

    @Bean
    CompanyUseCase companyService(final CompanyPersistence companyPersistence) {
        return new CompanyService(companyPersistence);
    }
}
