package com.ms_nucleo.rest.controller

import com.ms_nucleo.domain.entity.Candidato
import com.ms_nucleo.domain.entity.Empresa
import com.ms_nucleo.service.CandidatoService
import com.ms_nucleo.service.EmpresaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/empresa")
class EmpresaController {

    @Autowired
    private EmpresaService service


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Empresa save(@RequestBody Empresa empresa) {
        return this.service.save(empresa)
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void update(@PathVariable Integer id, @RequestBody Empresa empresa) {
        this.service.update(id, empresa)
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Integer id) {
        this.service.delete(id)
    }

    @GetMapping("{id}")
    Empresa getById(@PathVariable Integer id) {
        return this.service.getById(id)
    }

    @GetMapping
    List<Empresa> findAll() {
        return this.service.finAll()
    }
}
