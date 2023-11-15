package com.ms_nucleo.service

import com.ms_nucleo.domain.entity.Experiencia
import com.ms_nucleo.rest.dto.ExperienciaDTO

interface IExperienciaService {
    Experiencia save(Experiencia experiencia)
    void update (Integer id, Experiencia experiencia)
    void delete(Integer id)

    ExperienciaDTO getById(Integer id)
    List<Experiencia> findByIdCandidato(Integer idcandidato )
}