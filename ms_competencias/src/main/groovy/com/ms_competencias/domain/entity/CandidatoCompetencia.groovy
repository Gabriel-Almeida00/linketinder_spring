package com.ms_competencias.domain.entity

import com.ms_competencias.domain.enums.NivelCompetencia
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
class CandidatoCompetencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Integer id

    @Column
    Integer idCandidato

    @Column
    Integer idCompetencia

    @Column
    NivelCompetencia nivelCompetencia
}
