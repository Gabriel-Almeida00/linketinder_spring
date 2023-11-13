package com.ms_competencias.service

import com.ms_competencias.domain.entity.Competencia
import com.ms_competencias.domain.repository.CompetenciaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

@Service
class CompetenciaService implements ICompetenciaService{

    @Autowired
    private CompetenciaRepository competenciaRepository

    @Override
    Competencia save(Competencia competencia) {
        this.competenciaRepository.save(competencia)
        return competencia
    }

    @Override
    void update(Integer id, Competencia competencia) {
        competenciaRepository.findById(id)
                .map( p -> {
                    competencia.setId(p.getId())
                    competenciaRepository.save(competencia)
                    return competencia
                })
                .orElseThrow( () ->
                new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Competencia não encontrado."))
    }

    @Override
    void delete(Integer id) {
        this.competenciaRepository.findById(id)
        .map(p -> {
            competenciaRepository.delete(p)
            return Void.TYPE
        })
        .orElseThrow( () ->
                new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Competencia não encontrado."))
    }

    @Override
    Competencia getById(Integer id) {
        return competenciaRepository.findById(id)
                .orElseThrow( () ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Competencia não encontrado."))
    }

    @Override
    List<Competencia> finAll() {
        return this.competenciaRepository.findAll()
    }
}
