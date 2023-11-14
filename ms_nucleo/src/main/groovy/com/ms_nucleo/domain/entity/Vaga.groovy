package com.ms_nucleo.domain.entity

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

@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private Integer formacaoMinima

    @Column
    private Integer experienciaMinima

}
