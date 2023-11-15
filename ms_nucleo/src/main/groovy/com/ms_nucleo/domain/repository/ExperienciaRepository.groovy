package com.ms_nucleo.domain.repository


import com.ms_nucleo.domain.entity.Experiencia
import com.ms_nucleo.rest.dto.ExperienciaDTO
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ExperienciaRepository extends JpaRepository<Experiencia, Integer>{

   @Query("SELECT new com.ms_nucleo.rest.dto.ExperienciaDTO(e.id, e.cargo, e.empresa, e.nivel) FROM Experiencia e  WHERE e.candidato.id = :idCandidato")
   List<ExperienciaDTO> findByCandidato_id(@Param("idCandidato") Integer idCandidato);
}