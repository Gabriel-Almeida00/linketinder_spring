package com.ms_nucleo.domain.entity

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


@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
