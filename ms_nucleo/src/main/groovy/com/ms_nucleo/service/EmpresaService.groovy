package com.ms_nucleo.service

import com.ms_nucleo.domain.entity.Empresa
import com.ms_nucleo.domain.repository.EmpresaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class EmpresaService implements IEmpresaService {

    @Autowired
    private EmpresaRepository repository

    @Override
    Empresa save(Empresa empresa) {
        this.repository.save(empresa)
        return empresa
    }

    @Override
    void update(Integer id, Empresa empresa) {
        this.repository.findById(id)
                .map(p -> {
                    empresa.setId(p.getId())
                    this.repository.save(empresa)
                    return empresa
                })
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Empresa não encontrado."))
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
                                "Empresa não encontrado."))
    }

    @Override
    Empresa getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Empresa não encontrado."))
    }

    @Override
    List<Empresa> finAll() {
        return this.repository.findAll()
    }
}
