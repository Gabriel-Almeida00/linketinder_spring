package com.ms_competencias.domain.repository

import com.ms_competencias.domain.entity.CandidatoCompetencia
import org.springframework.data.jpa.repository.JpaRepository

interface CandidatoCompetenciaRepository extends JpaRepository<CandidatoCompetencia, Integer>{

}