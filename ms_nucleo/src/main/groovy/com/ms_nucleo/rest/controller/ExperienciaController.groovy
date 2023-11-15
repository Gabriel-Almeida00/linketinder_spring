package com.ms_nucleo.rest.controller

import com.ms_nucleo.domain.entity.Experiencia
import com.ms_nucleo.rest.dto.ExperienciaDTO
import com.ms_nucleo.service.ExperienciaService
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
@RequestMapping("/api/experiencia")
class ExperienciaController {

    @Autowired
    private ExperienciaService service

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Experiencia save(@RequestBody Experiencia experiencia) {
        return this.service.save(experiencia)
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void update(@PathVariable Integer id, @RequestBody Experiencia experiencia) {
        this.service.update(id, experiencia)
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Integer id) {
        this.service.delete(id)
    }

    @GetMapping("{id}")
    Experiencia getById(@PathVariable Integer id) {
        return this.service.getById(id)
    }

    @GetMapping("{id}/all")
    List<ExperienciaDTO> findAll(@PathVariable Integer id) {
        return this.service.findByIdCandidato(id)
    }
}
