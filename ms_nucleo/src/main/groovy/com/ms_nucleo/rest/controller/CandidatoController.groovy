package com.ms_nucleo.rest.controller

import com.ms_nucleo.domain.entity.Candidato
import com.ms_nucleo.service.CandidatoService
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
@RequestMapping("/api/candidato")
class CandidatoController {

    @Autowired
    private CandidatoService candidatoService


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Candidato save(@RequestBody Candidato candidato) {
        return this.candidatoService.save(candidato)
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void update(@PathVariable Integer id, @RequestBody Candidato candidato) {
        this.candidatoService.update(id, candidato)
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Integer id) {
        this.candidatoService.delete(id)
    }

    @GetMapping("{id}")
    Candidato getById(@PathVariable Integer id) {
        return this.candidatoService.getById(id)
    }

    @GetMapping
    List<Candidato> findAll() {
        return this.candidatoService.finAll()
    }
}
