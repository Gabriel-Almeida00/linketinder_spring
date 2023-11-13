package com.ms_competencias.service

import com.ms_competencias.domain.entity.CandidatoCompetencia

interface ICandidatoCompetenciaService {
    CandidatoCompetencia save(CandidatoCompetencia competencia)
    void update (Integer id, CandidatoCompetencia competencia)
    void delete(Integer id)
    CandidatoCompetencia getById(Integer id)
    List<CandidatoCompetencia> finAll(Integer id)
}