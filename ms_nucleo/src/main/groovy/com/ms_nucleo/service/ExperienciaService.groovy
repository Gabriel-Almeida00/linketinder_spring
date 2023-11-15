package com.ms_nucleo.service

import com.ms_nucleo.domain.entity.Experiencia
import com.ms_nucleo.domain.repository.ExperienciaRepository
import com.ms_nucleo.rest.dto.ExperienciaDTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class ExperienciaService implements IExperienciaService{

    @Autowired
    private ExperienciaRepository repository

    @Override
    Experiencia save(Experiencia experiencia) {
        this.repository.save(experiencia)
        return experiencia
    }

    @Override
    void update(Integer id, Experiencia experiencia) {
        this.repository.findById(id)
                .map(p -> {
                    experiencia.setId(p.getId())
                    this.repository.save(experiencia)
                    return experiencia
                })
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Experiencia não encontrado."))
    }

    @Override
    void delete(Integer id) {
        this.repository.findById(id)
                .map(p -> {
                    repository.delete(p)
                    return Void.TYPE
                })
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Experiencia não encontrada."))
    }

    @Override
    Experiencia getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Experiencia não encontrada."))
    }

    @Override
    List<ExperienciaDTO> findByIdCandidato(Integer idcandidato) {
        return this.repository.findByCandidato_id(idcandidato)
    }
}
