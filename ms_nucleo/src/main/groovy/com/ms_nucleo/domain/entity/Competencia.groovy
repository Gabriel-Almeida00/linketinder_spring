package com.ms_nucleo.domain.entity

class Competencia {
    Integer id
    String nome
    String nivel

    Competencia(Integer id, String nome, String nivel) {
        this.id = id
        this.nome = nome
        this.nivel = nivel
    }
}
