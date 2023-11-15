package com.ms_nucleo.rest.dto


import com.ms_nucleo.domain.enums.FormacaoNivel

class FormacaoDTO {

    private Integer id
    private String instituicao
    private String curso
    private FormacaoNivel nivel
    private Date anoConclusao

    FormacaoDTO(Integer id, String instituicao, String curso, FormacaoNivel nivel, Date anoConclusao) {
        this.id = id
        this.instituicao = instituicao
        this.curso = curso
        this.nivel = nivel
        this.anoConclusao = anoConclusao
    }

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    String getInstituicao() {
        return instituicao
    }

    void setInstituicao(String instituicao) {
        this.instituicao = instituicao
    }

    String getCurso() {
        return curso
    }

    void setCurso(String curso) {
        this.curso = curso
    }

    FormacaoNivel getNivel() {
        return nivel
    }

    void setNivel(FormacaoNivel nivel) {
        this.nivel = nivel
    }

    Date getAnoConclusao() {
        return anoConclusao
    }

    void setAnoConclusao(Date anoConclusao) {
        this.anoConclusao = anoConclusao
    }
}
