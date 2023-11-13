package com.ms_competencias.service

import com.ms_competencias.domain.entity.VagaCompetencia

interface IVagaCompetencia {
    VagaCompetencia save(VagaCompetencia competencia)
    void update (Integer id, VagaCompetencia competencia)
    void delete(Integer id)
    VagaCompetencia getById(Integer id)
    List<VagaCompetencia> finAll(Integer id)
}