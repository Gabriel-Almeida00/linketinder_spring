package com.ms_competencias.domain.repository


import com.ms_competencias.domain.entity.VagaCompetencia
import com.ms_competencias.rest.dto.CompetenciaDTO
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface VagaCompetenciaRepository extends JpaRepository<VagaCompetencia, Integer> {

    @Query("SELECT  new com.ms_competencias.rest.dto.CompetenciaDTO(cc.id, c.nome, cc.nivelCompetencia) FROM VagaCompetencia cc JOIN Competencia c ON cc.idVaga = c.id WHERE cc.idVaga = :idVaga")
    List<CompetenciaDTO> findByIdVaga(@Param("idVaga") Integer idVaga)
}