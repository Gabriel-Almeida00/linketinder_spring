package com.ms_nucleo.rest.dto


import com.ms_nucleo.domain.enums.ExperienciaNivel
import com.ms_nucleo.domain.enums.FormacaoNivel

class VagaDTO {


    private Integer id
    private String nome
    private String descricao
    private String cidade
    private FormacaoNivel formacaoMinima
    private ExperienciaNivel experienciaMinima

    VagaDTO(Integer id, String nome, String descricao, String cidade, FormacaoNivel formacaoMinima, ExperienciaNivel experienciaMinima) {
        this.id = id
        this.nome = nome
        this.descricao = descricao
        this.cidade = cidade
        this.formacaoMinima = formacaoMinima
        this.experienciaMinima = experienciaMinima
    }

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    String getNome() {
        return nome
    }

    void setNome(String nome) {
        this.nome = nome
    }

    String getDescricao() {
        return descricao
    }

    void setDescricao(String descricao) {
        this.descricao = descricao
    }

    String getCidade() {
        return cidade
    }

    void setCidade(String cidade) {
        this.cidade = cidade
    }

    FormacaoNivel getFormacaoMinima() {
        return formacaoMinima
    }

    void setFormacaoMinima(FormacaoNivel formacaoMinima) {
        this.formacaoMinima = formacaoMinima
    }

    ExperienciaNivel getExperienciaMinima() {
        return experienciaMinima
    }

    void setExperienciaMinima(ExperienciaNivel experienciaMinima) {
        this.experienciaMinima = experienciaMinima
    }
}
