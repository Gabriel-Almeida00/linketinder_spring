package com.ms_nucleo.domain.entity

import com.ms_nucleo.domain.enums.ExperienciaNivel
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
class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa

    @Column
    private String nome

    @Column
    private String descricao

    @Column
    private String cidade

    @Column
    private FormacaoNivel formacaoMinima

    @Column
    private ExperienciaNivel experienciaMinima

    Vaga(Integer id, Empresa empresa, String nome, String descricao, String cidade, FormacaoNivel formacaoMinima, ExperienciaNivel experienciaMinima) {
        this.id = id
        this.empresa = empresa
        this.nome = nome
        this.descricao = descricao
        this.cidade = cidade
        this.formacaoMinima = formacaoMinima
        this.experienciaMinima = experienciaMinima
    }

    Vaga() {
    }

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    Empresa getEmpresa() {
        return empresa
    }

    void setEmpresa(Empresa empresa) {
        this.empresa = empresa
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
