package com.ms_competencias.rest.controller

import com.ms_competencias.domain.entity.Competencia
import com.ms_competencias.domain.repository.CompetenciaRepository
import com.ms_competencias.service.CompetenciaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Example
import org.springframework.data.domain.ExampleMatcher
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException
import org.springframework.http.HttpStatus

@RestController
@RequestMapping("/api/competencia")
class CompetenciaController {

    @Autowired
    CompetenciaService competenciaService

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Competencia save(@RequestBody Competencia competencia) {
        return this.competenciaService.save(competencia)
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void update(@PathVariable Integer id, @RequestBody Competencia competencia) {
      this.competenciaService.update(id, competencia)
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Integer id) {
       this.competenciaService.delete(id)
    }

    @GetMapping("{id}")
    Competencia getById(@PathVariable Integer id) {
       return this.competenciaService.getById(id)
    }

    @GetMapping
    List<Competencia> findAll() {
      return this.competenciaService.finAll()
    }
}
