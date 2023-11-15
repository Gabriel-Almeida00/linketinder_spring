package com.ms_nucleo.service

import com.ms_nucleo.domain.entity.Experiencia

interface IExperienciaService {
    Experiencia save(Experiencia experiencia)
    void update (Integer id, Experiencia experiencia)
    void delete(Integer id)
    Experiencia getById(Integer id)
    List<Experiencia> findByIdCandidato(Integer idcandidato )
}