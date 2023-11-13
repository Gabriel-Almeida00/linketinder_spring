package com.ms_competencias.domain.repository

import com.ms_competencias.domain.entity.CandidatoCompetencia
import com.ms_competencias.domain.entity.VagaCompetencia
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VagaCompetenciaRepository extends JpaRepository<VagaCompetencia, Integer> {
    List<VagaCompetencia> findByIdVaga(Integer idVaga)
}