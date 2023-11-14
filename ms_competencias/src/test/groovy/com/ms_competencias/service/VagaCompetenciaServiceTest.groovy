package com.ms_competencias.service

import com.ms_competencias.domain.entity.Competencia
import com.ms_competencias.domain.entity.VagaCompetencia
import com.ms_competencias.domain.repository.CompetenciaRepository
import com.ms_competencias.domain.repository.VagaCompetenciaRepository
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import static org.mockito.Mockito.*

class VagaCompetenciaServiceTest {

    private VagaCompetenciaRepository repository


    @BeforeEach
    void setup() {
        repository = mock(VagaCompetenciaRepository.class)
    }

    @Test
    void finAll() {
        List<VagaCompetencia> competencias = new ArrayList<>()
        VagaCompetencia competencia1 = new VagaCompetencia()
        VagaCompetencia competencia2 = new VagaCompetencia()
        competencias.add(competencia1)
        competencias.add(competencia2)

        when(repository.findAll()).thenReturn(competencias)

        List<VagaCompetencia> result = repository.findAll()

        assert competencias == result
    }

    @Test
    void findById() {
        Integer competenciaId = 1
        VagaCompetencia expectedCompetencia = new VagaCompetencia()
        expectedCompetencia.setId(competenciaId)

        when(repository.findById(competenciaId)).thenReturn(Optional.of(expectedCompetencia))

        Optional<VagaCompetencia> result = repository.findById(competenciaId)

        assert Optional.of(expectedCompetencia) == result
    }

    @Test
    void delete() {
        Integer competenciaId = 1
        VagaCompetencia competencia = new VagaCompetencia()
        competencia.setId(competenciaId)

        when(repository.findById(competenciaId)).thenReturn(Optional.of(competencia))

        repository.delete(competencia)

        verify(repository).delete(competencia)
    }

    @Test
    void update(){
        Integer id = 1
        VagaCompetencia competencia = new VagaCompetencia()

        when(repository.findById(id)).thenReturn(Optional.of(competencia))

        repository.save(competencia)

        verify(repository).save(competencia)
    }

    @Test
    void save(){
        VagaCompetencia competencia = new VagaCompetencia()

        repository.save(competencia)

        verify(repository).save(competencia)
    }
}