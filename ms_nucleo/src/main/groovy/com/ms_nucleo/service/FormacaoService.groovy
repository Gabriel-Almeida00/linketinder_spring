package com.ms_nucleo.service

import com.ms_nucleo.domain.entity.Formacao
import com.ms_nucleo.domain.repository.FormacaoRepository
import com.ms_nucleo.rest.dto.FormacaoDTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class FormacaoService implements IFormacaoService {

    @Autowired
    private FormacaoRepository repository

    @Override
    Formacao save(Formacao formacao) {
        this.repository.save(formacao)
        return formacao
    }

    @Override
    void update(Integer id, Formacao formacao) {
        this.repository.findById(id)
                .map(p -> {
                    formacao.setId(p.getId())
                    this.repository.save(formacao)
                    return formacao
                })
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "formacao não encontrado."))
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
                                "formacao não encontrada."))
    }

    @Override
    FormacaoDTO getById(Integer id) {
        this.repository.findById(id)
                .map(p -> {
                    FormacaoDTO formacaoDTO = new FormacaoDTO(
                            p.getId(),
                            p.getInstituicao(),
                            p.getCurso(),
                            p.getNivel(),
                            p.getAnoConclusao()
                    )

                    return formacaoDTO
                })
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "formacao não encontrada."))
    }

    @Override
    List<FormacaoDTO> findByIdCandidato(Integer idcandidato) {
        return this.repository.findByCandidato_id(idcandidato)
    }
}
