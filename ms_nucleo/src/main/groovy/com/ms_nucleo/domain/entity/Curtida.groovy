package com.ms_nucleo.domain.entity

import com.ms_nucleo.domain.enums.CurtidaStatus
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
class Curtida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Integer id

    @Column
    Integer idCandidato

    @Column
    Integer idVaga

    @Column
    Integer idEmpresa

    @Column
    CurtidaStatus curtidaStatus
}
