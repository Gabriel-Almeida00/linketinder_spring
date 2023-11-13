package com.ms_competencias.service

import com.ms_competencias.domain.entity.VagaCompetencia
import com.ms_competencias.domain.repository.VagaCompetenciaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class VagaCompetenciaService implements IVagaCompetencia{

    @Autowired
    private VagaCompetenciaRepository vagaCompetenciaRepository

    @Override
    VagaCompetencia save(VagaCompetencia competencia) {
        this.vagaCompetenciaRepository.save(competencia)
        return competencia
    }

    @Override
    void update(Integer id, VagaCompetencia competencia) {
        this.vagaCompetenciaRepository.findById(id)
                .map(p -> {
                    competencia.setId(p.getId())
                    competencia.setIdVaga(p.getIdVaga())
                    competencia.setIdCompetencia(p.getIdCompetencia())
                    this.vagaCompetenciaRepository.save(competencia)
                    return competencia
                })
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Competencia não encontrado."))
    }

    @Override
    void delete(Integer id) {
        this.vagaCompetenciaRepository.findById(id)
                .map(p -> {
                    vagaCompetenciaRepository.delete(p)
                    return Void.TYPE
                })
                .orElseThrow( () ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Competencia não encontrado."))
    }

    @Override
    VagaCompetencia getById(Integer id) {
        return vagaCompetenciaRepository.findById(id)
                .orElseThrow( () ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Competencia não encontrado."))
    }

    @Override
    List<VagaCompetencia> finAll(Integer id) {
        return this.vagaCompetenciaRepository.findByIdVaga(id)
    }
}
