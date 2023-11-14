package com.ms_nucleo.domain.repository

import com.ms_nucleo.domain.entity.Candidato
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CandidatoRepository extends JpaRepository<Candidato, Integer>{

}