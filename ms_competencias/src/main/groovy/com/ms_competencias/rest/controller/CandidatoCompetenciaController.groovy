package com.ms_competencias.rest.controller

import com.ms_competencias.domain.entity.CandidatoCompetencia
import com.ms_competencias.service.CandidatoCompetenciaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/candidato/competencia")
class CandidatoCompetenciaController {

    @Autowired
    private CandidatoCompetenciaService service

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    CandidatoCompetencia save(@RequestBody CandidatoCompetencia competencia) {
        return this.service.save(competencia)
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void update(@PathVariable Integer id, @RequestBody CandidatoCompetencia competencia) {
        this.service.update(id, competencia)
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Integer id) {
        this.service.delete(id)
    }

    @GetMapping("{id}")
    CandidatoCompetencia getById(@PathVariable Integer id) {
        return this.service.getById(id)
    }

    @GetMapping("{id}/all")
    List<CandidatoCompetencia> findAll(@PathVariable Integer id) {
        return this.service.finAll(id)
    }
}
