package com.ms_nucleo.service

import com.ms_nucleo.domain.entity.Vaga
import com.ms_nucleo.domain.repository.VagaRepository
import com.ms_nucleo.rest.dto.FormacaoDTO
import com.ms_nucleo.rest.dto.VagaDTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class VagaService implements IVagaService {

    @Autowired
    private VagaRepository repository

    @Override
    Vaga save(Vaga vaga) {
        this.repository.save(vaga)
        return vaga
    }

    @Override
    void update(Integer id, Vaga vaga) {
        this.repository.findById(id)
                .map(p -> {
                    vaga.setId(p.getId())
                    this.repository.save(vaga)
                    return vaga
                })
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "vaga não encontrado."))
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
                                "vaga não encontrada."))
    }

    @Override
    VagaDTO getById(Integer id) {
        this.repository.findById(id)
                .map(p -> {
                    VagaDTO vagaDTO = new VagaDTO(
                            p.getId(),
                            p.getNome(),
                            p.getDescricao(),
                            p.getCidade(),
                            p.getFormacaoMinima(),
                            p.getExperienciaMinima(),
                    )
                    return vagaDTO
                })
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "vaga não encontrada."))
    }

    @Override
    List<VagaDTO> finAll(Integer idEmpresa) {
        return this.repository.findByEmpresa_id(idEmpresa)
    }
}
