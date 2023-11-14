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


@Data
@AllArgsConstructor
@NoArgsConstructor
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
}
