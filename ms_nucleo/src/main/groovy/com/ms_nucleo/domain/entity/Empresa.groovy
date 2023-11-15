package com.ms_nucleo.domain.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

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
class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id

    @Column
    private String nome

    @Column
    private String email

    @Column
    private String pais

    @Column
    private String cep

    @Column
    private String cnpj

    @Column
    private String descricao

    @Column
    private String senha

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("empresa")
    private List<Vaga> vagas

    Empresa(Integer id, String nome, String email, String pais, String cep, String cnpj, String descricao, String senha) {
        this.id = id
        this.nome = nome
        this.email = email
        this.pais = pais
        this.cep = cep
        this.cnpj = cnpj
        this.descricao = descricao
        this.senha = senha
    }

    Empresa() {
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

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }

    String getPais() {
        return pais
    }

    void setPais(String pais) {
        this.pais = pais
    }

    String getCep() {
        return cep
    }

    void setCep(String cep) {
        this.cep = cep
    }

    String getCnpj() {
        return cnpj
    }

    void setCnpj(String cnpj) {
        this.cnpj = cnpj
    }

    String getDescricao() {
        return descricao
    }

    void setDescricao(String descricao) {
        this.descricao = descricao
    }

    String getSenha() {
        return senha
    }

    void setSenha(String senha) {
        this.senha = senha
    }

    List<Vaga> getVagas() {
        return vagas
    }

    void setVagas(List<Vaga> vagas) {
        this.vagas = vagas
    }
}
