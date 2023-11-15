package com.ms_nucleo.domain.repository

import com.ms_nucleo.domain.entity.Formacao
import com.ms_nucleo.rest.dto.ExperienciaDTO
import com.ms_nucleo.rest.dto.FormacaoDTO
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface FormacaoRepository extends JpaRepository<Formacao, Integer>{

    @Query("SELECT new com.ms_nucleo.rest.dto.FormacaoDTO(e.id, e.instituicao, e.curso, e.nivel, e.anoConclusao) FROM Formacao e  WHERE e.candidato.id = :idCandidato")
    List<FormacaoDTO> findByCandidato_id(@Param("idCandidato") Integer idCandidato)
}