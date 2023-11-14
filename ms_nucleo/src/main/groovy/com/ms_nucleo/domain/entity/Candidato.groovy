package com.ms_nucleo.domain.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties


import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table


@Entity
@Table
class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id

    @Column
    private String nome

    @Column
    private String sobrenome

    @Column
    private Date dataNascimento

    @Column
    private String descricao

    @Column
    private String email

    @Column
    private String cpf

    @Column
    private String cep

    @Column
    private String pais

    @Column
    private String redeSocial

    @Column
    private String telefone

    @Column
    private String senha

    @OneToMany(mappedBy = "candidato", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("candidato")
    private List<Formacao> formacoes

    @OneToMany(mappedBy = "candidato", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("candidato")
    private List<Experiencia> experiencias

    Candidato(Integer id, String nome, String sobrenome, Date dataNascimento, String descricao, String email, String cpf, String cep, String pais, String redeSocial, String telefone, String senha) {
        this.id = id
        this.nome = nome
        this.sobrenome = sobrenome
        this.dataNascimento = dataNascimento
        this.descricao = descricao
        this.email = email
        this.cpf = cpf
        this.cep = cep
        this.pais = pais
        this.redeSocial = redeSocial
        this.telefone = telefone
        this.senha = senha
    }

    Candidato() {
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

    String getSobrenome() {
        return sobrenome
    }

    void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome
    }

    Date getDataNascimento() {
        return dataNascimento
    }

    void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento
    }

    String getDescricao() {
        return descricao
    }

    void setDescricao(String descricao) {
        this.descricao = descricao
    }

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }

    String getCpf() {
        return cpf
    }

    void setCpf(String cpf) {
        this.cpf = cpf
    }

    String getCep() {
        return cep
    }

    void setCep(String cep) {
        this.cep = cep
    }

    String getPais() {
        return pais
    }

    void setPais(String pais) {
        this.pais = pais
    }

    String getRedeSocial() {
        return redeSocial
    }

    void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial
    }

    String getTelefone() {
        return telefone
    }

    void setTelefone(String telefone) {
        this.telefone = telefone
    }

    String getSenha() {
        return senha
    }

    void setSenha(String senha) {
        this.senha = senha
    }

    List<Formacao> getFormacoes() {
        return formacoes
    }

    void setFormacoes(List<Formacao> formacoes) {
        this.formacoes = formacoes
    }

    List<Experiencia> getExperiencias() {
        return experiencias
    }

    void setExperiencias(List<Experiencia> experiencias) {
        this.experiencias = experiencias
    }
}
