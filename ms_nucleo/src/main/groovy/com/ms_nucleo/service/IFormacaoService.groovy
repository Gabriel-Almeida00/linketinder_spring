package com.ms_nucleo.service


import com.ms_nucleo.domain.entity.Formacao
import com.ms_nucleo.rest.dto.FormacaoDTO

interface IFormacaoService {
    Formacao save(Formacao formacao)

    void update(Integer id, Formacao formacao)

    void delete(Integer id)

    FormacaoDTO getById(Integer id)

    List<FormacaoDTO> findByIdCandidato(Integer idcandidato)
}