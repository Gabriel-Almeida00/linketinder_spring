package com.ms_competencias.service

import com.ms_competencias.domain.entity.Competencia
import com.ms_competencias.domain.repository.CompetenciaRepository
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import static org.mockito.Mockito.mock
import static org.mockito.Mockito.verify
import static org.mockito.Mockito.when

class CompetenciaServiceTest {

    private CompetenciaRepository competenciaRepository


    @BeforeEach
    void setup() {
        competenciaRepository = mock(CompetenciaRepository.class)
    }

    @Test
    void finAll() {
        List<Competencia> competencias = new ArrayList<>()
        Competencia competencia1 = new Competencia()
        Competencia competencia2 = new Competencia()
        competencias.add(competencia1)
        competencias.add(competencia2)

        when(competenciaRepository.findAll()).thenReturn(competencias)

        List<Competencia> result = competenciaRepository.findAll()

        assert competencias == result
    }

    @Test
    void findById() {
        Integer competenciaId = 1
        Competencia expectedCompetencia = new Competencia()
        expectedCompetencia.setId(competenciaId)

        when(competenciaRepository.findById(competenciaId)).thenReturn(Optional.of(expectedCompetencia))

        Optional<Competencia> result = competenciaRepository.findById(competenciaId)

        assert Optional.of(expectedCompetencia) == result
    }

    @Test
    void delete() {
        Integer competenciaId = 1
        Competencia competencia = new Competencia()
        competencia.setId(competenciaId)

        when(competenciaRepository.findById(competenciaId)).thenReturn(Optional.of(competencia))

        competenciaRepository.delete(competencia)

        verify(competenciaRepository).delete(competencia)
    }

    @Test
    void update(){
        Integer id = 1
        Competencia competencia = new Competencia()

        when(competenciaRepository.findById(id)).thenReturn(Optional.of(competencia))

        competenciaRepository.save(competencia)

        verify(competenciaRepository).save(competencia)
    }

    @Test
    void save(){
        Competencia competencia = new Competencia()

        competenciaRepository.save(competencia)

        verify(competenciaRepository).save(competencia)
    }
}