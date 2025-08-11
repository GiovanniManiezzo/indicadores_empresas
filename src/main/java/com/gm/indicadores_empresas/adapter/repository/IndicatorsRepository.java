package com.gm.indicadores_empresas.adapter.repository;

import com.gm.indicadores_empresas.adapter.out.jpa.IndicatorsJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndicatorsRepository extends JpaRepository<IndicatorsJpaEntity, Long> {

    List<IndicatorsJpaEntity> findAllByCompany_Ticker(String ticker);

}
