package com.ms_nucleo.domain.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.ms_nucleo.domain.enums.ExperienciaNivel
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
class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id

    @ManyToOne
    @JoinColumn(name = "id_candidato")
    private Candidato candidato

    @Column
    private String cargo

    @Column
    private String empresa

    @Column
    private ExperienciaNivel nivel

    Experiencia(Integer id, Candidato candidato, String cargo, String empresa, ExperienciaNivel nivel) {
        this.id = id
        this.candidato = candidato
        this.cargo = cargo
        this.empresa = empresa
        this.nivel = nivel
    }

    Experiencia() {
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

    String getCargo() {
        return cargo
    }

    void setCargo(String cargo) {
        this.cargo = cargo
    }

    String getEmpresa() {
        return empresa
    }

    void setEmpresa(String empresa) {
        this.empresa = empresa
    }

    ExperienciaNivel getNivel() {
        return nivel
    }

    void setNivel(ExperienciaNivel nivel) {
        this.nivel = nivel
    }
}
