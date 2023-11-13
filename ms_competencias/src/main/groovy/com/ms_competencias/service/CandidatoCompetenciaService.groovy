package com.ms_competencias.service

import com.ms_competencias.domain.entity.CandidatoCompetencia
import com.ms_competencias.domain.repository.CandidatoCompetenciaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class CandidatoCompetenciaService implements ICandidatoCompetenciaService {

    @Autowired
    private CandidatoCompetenciaRepository candidatoCompetenciaRepository

    @Override
    CandidatoCompetencia save(CandidatoCompetencia competencia) {
        this.candidatoCompetenciaRepository.save(competencia)
        return competencia
    }

    @Override
    void update(Integer id, CandidatoCompetencia competencia) {
        this.candidatoCompetenciaRepository.findById(id)
                .map(p -> {
                    competencia.setId(p.getId())
                    competencia.setIdCandidato(p.getIdCandidato())
                    competencia.setIdCompetencia(p.getIdCompetencia())
                    this.candidatoCompetenciaRepository.save(competencia)
                    return competencia
                })
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Competencia não encontrado."))
    }

    @Override
    void delete(Integer id) {
        this.candidatoCompetenciaRepository.findById(id)
                .map(p -> {
                    candidatoCompetenciaRepository.delete(p)
                    return Void.TYPE
                })
                .orElseThrow( () ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Competencia não encontrado."))
    }

    @Override
    CandidatoCompetencia getById(Integer id) {
        return candidatoCompetenciaRepository.findById(id)
                .orElseThrow( () ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Competencia não encontrado."))
    }

    @Override
    List<CandidatoCompetencia> finAll(Integer id) {
        return candidatoCompetenciaRepository.findByIdCandidato(id)

    }
}
