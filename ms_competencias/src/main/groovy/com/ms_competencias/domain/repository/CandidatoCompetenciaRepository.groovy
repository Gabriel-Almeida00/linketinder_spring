package com.ms_competencias.domain.repository

import com.ms_competencias.domain.entity.CandidatoCompetencia
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CandidatoCompetenciaRepository extends JpaRepository<CandidatoCompetencia, Integer> {
   List<CandidatoCompetencia> findByIdCandidato(Integer idCandidato)
}