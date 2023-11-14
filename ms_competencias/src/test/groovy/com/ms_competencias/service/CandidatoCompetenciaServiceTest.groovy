package com.ms_competencias.service

import com.ms_competencias.domain.entity.CandidatoCompetencia
import com.ms_competencias.domain.entity.Competencia
import com.ms_competencias.domain.repository.CandidatoCompetenciaRepository
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import static org.mockito.Mockito.*

class CandidatoCompetenciaServiceTest {

    private CandidatoCompetenciaRepository repository


    @BeforeEach
    void setup() {
        repository = mock(CandidatoCompetenciaRepository.class)
    }

    @Test
    void finAll() {
        List<CandidatoCompetencia> competencias = new ArrayList<>()
        CandidatoCompetencia competencia1 = new CandidatoCompetencia()
        CandidatoCompetencia competencia2 = new CandidatoCompetencia()
        competencias.add(competencia1)
        competencias.add(competencia2)

        when(repository.findAll()).thenReturn(competencias)

        List<CandidatoCompetencia> result = repository.findAll()

        assert competencias == result
    }

    @Test
    void findById() {
        Integer competenciaId = 1
        CandidatoCompetencia expectedCompetencia = new CandidatoCompetencia()
        expectedCompetencia.setId(competenciaId)

        when(repository.findById(competenciaId)).thenReturn(Optional.of(expectedCompetencia))

        Optional<CandidatoCompetencia> result = repository.findById(competenciaId)

        assert Optional.of(expectedCompetencia) == result
    }

    @Test
    void delete() {
        Integer competenciaId = 1
        CandidatoCompetencia competencia = new CandidatoCompetencia()
        competencia.setId(competenciaId)

        when(repository.findById(competenciaId)).thenReturn(Optional.of(competencia))

        repository.delete(competencia)

        verify(repository).delete(competencia)
    }

    @Test
    void update(){
        Integer id = 1
        CandidatoCompetencia competencia = new CandidatoCompetencia()

        when(repository.findById(id)).thenReturn(Optional.of(competencia))

        repository.save(competencia)

        verify(repository).save(competencia)
    }

    @Test
    void save(){
        CandidatoCompetencia competencia = new CandidatoCompetencia()

        repository.save(competencia)

        verify(repository).save(competencia)
    }
}