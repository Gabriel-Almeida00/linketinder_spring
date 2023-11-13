package com.ms_competencias.domain.repository

import com.ms_competencias.domain.entity.CandidatoCompetencia
import com.ms_competencias.rest.dto.CompetenciaDTO
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface CandidatoCompetenciaRepository extends JpaRepository<CandidatoCompetencia, Integer> {

   @Query("SELECT new com.ms_competencias.rest.dto.CompetenciaDTO(cc.id, c.nome, cc.nivelCompetencia) FROM CandidatoCompetencia cc JOIN Competencia c ON cc.idCompetencia = c.id WHERE cc.idCandidato = :idCandidato")
   List<CompetenciaDTO> findByIdCandidato(@Param("idCandidato") Integer idCandidato);
}