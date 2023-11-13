package com.ms_competencias.domain.repository

import com.ms_competencias.domain.entity.Competencia
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CompetenciaRepository extends JpaRepository<Competencia, Integer> {
}
