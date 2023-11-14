package com.ms_nucleo.service

import com.ms_nucleo.domain.entity.Candidato
import com.ms_nucleo.domain.repository.CandidatoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class CandidatoService implements ICandidatoService {

    @Autowired
    private CandidatoRepository candidatoRepository

    @Override
    Candidato save(Candidato candidato) {
        this.candidatoRepository.save(candidato)
        return candidato
    }

    @Override
    void update(Integer id, Candidato candidato) {
        this.candidatoRepository.findById(id)
                .map(p -> {
                    candidato.setId(p.getId())
                    this.candidatoRepository.save(candidato)
                    return candidato
                })
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Candidato não encontrado."))
    }

    @Override
    void delete(Integer id) {
        this.candidatoRepository.findById(id)
                .map(p -> {
                    candidatoRepository.delete(p)
                    return Void.TYPE
                })
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Candidato não encontrado."))
    }

    @Override
    Candidato getById(Integer id) {
        return candidatoRepository.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Candidato não encontrado."))
    }

    @Override
    List<Candidato> finAll() {
        return candidatoRepository.findAll()
    }
}
