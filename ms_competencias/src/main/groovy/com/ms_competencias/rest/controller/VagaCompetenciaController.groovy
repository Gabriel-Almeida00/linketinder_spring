package com.ms_competencias.rest.controller

import com.ms_competencias.domain.entity.CandidatoCompetencia
import com.ms_competencias.domain.entity.VagaCompetencia
import com.ms_competencias.rest.dto.CompetenciaDTO
import com.ms_competencias.service.CandidatoCompetenciaService
import com.ms_competencias.service.VagaCompetenciaService
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
@RequestMapping("/api/vaga/competencia")
class VagaCompetenciaController {

    @Autowired
    private VagaCompetenciaService service

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    VagaCompetencia save(@RequestBody VagaCompetencia competencia) {
        return this.service.save(competencia)
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void update(@PathVariable Integer id, @RequestBody VagaCompetencia competencia) {
        this.service.update(id, competencia)
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Integer id) {
        this.service.delete(id)
    }

    @GetMapping("{id}")
    VagaCompetencia getById(@PathVariable Integer id) {
        return this.service.getById(id)
    }

    @GetMapping("{id}/all")
    List<CompetenciaDTO> findAll(@PathVariable Integer id) {
        return this.service.finAll(id)
    }
}
