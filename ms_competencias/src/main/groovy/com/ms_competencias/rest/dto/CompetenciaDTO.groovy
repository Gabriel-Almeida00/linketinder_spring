package com.ms_competencias.rest.dto

import com.ms_competencias.domain.enums.NivelCompetencia

class CompetenciaDTO {
    Integer id
    String nome
    NivelCompetencia nivel

    CompetenciaDTO(Integer id, String nome, NivelCompetencia nivel) {
        this.id = id
        this.nome = nome
        this.nivel = nivel
    }
}
