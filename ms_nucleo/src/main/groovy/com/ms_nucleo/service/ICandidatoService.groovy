package com.ms_nucleo.service

import com.ms_nucleo.domain.entity.Candidato

interface ICandidatoService {
    Candidato save(Candidato competencia)
    void update (Integer id, Candidato competencia)
    void delete(Integer id)
    Candidato getById(Integer id)
    List<Candidato> finAll( )
}