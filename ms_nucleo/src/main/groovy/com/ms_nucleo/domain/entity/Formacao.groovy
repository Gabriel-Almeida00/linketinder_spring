package com.ms_nucleo.domain.entity

import com.ms_nucleo.domain.enums.FormacaoNivel
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table


@Entity
@Table
class Formacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id

    @ManyToOne
    @JoinColumn(name = "id_candidato")
    private Candidato candidato

    @Column
    private String instituicao

    @Column
    private String curso

    @Column
    private FormacaoNivel nivel

    @Column
    private Date anoConclusao

    Formacao(Integer id, Candidato candidato, String instituicao, String curso, FormacaoNivel nivel, Date anoConclusao) {
        this.id = id
        this.candidato = candidato
        this.instituicao = instituicao
        this.curso = curso
        this.nivel = nivel
        this.anoConclusao = anoConclusao
    }

    Formacao() {
    }

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    Candidato getCandidato() {
        return candidato
    }

    void setCandidato(Candidato candidato) {
        this.candidato = candidato
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
