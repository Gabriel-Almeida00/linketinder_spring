package com.ms_competencias.domain.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
class Competencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Integer id

    @Column
    String nome
}
