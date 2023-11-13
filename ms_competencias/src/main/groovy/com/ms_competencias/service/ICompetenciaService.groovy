package com.ms_competencias.service

import com.ms_competencias.domain.entity.Competencia

interface ICompetenciaService {
    Competencia save(Competencia competencia)
    void update (Integer id, Competencia competencia)
    void delete(Integer id)
    Competencia getById(Integer id)
    List<Competencia> finAll()
}