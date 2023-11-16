package com.ms_nucleo.domain.repository

import com.ms_nucleo.domain.entity.Vaga
import com.ms_nucleo.rest.dto.VagaDTO
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface VagaRepository extends JpaRepository<Vaga, Integer>{

    @Query("SELECT new com.ms_nucleo.rest.dto.VagaDTO(e.id,e.nome, e.cidade, e.descricao, e.formacaoMinima, e.experienciaMinima) FROM Vaga e  WHERE e.empresa.id = :idEmpresa")
    List<VagaDTO> findByEmpresa_id(@Param("idEmpresa") Integer idEmpresa)
}