package com.ms_nucleo.rest.controller

import com.ms_nucleo.domain.entity.Formacao
import com.ms_nucleo.domain.entity.Vaga
import com.ms_nucleo.rest.dto.FormacaoDTO
import com.ms_nucleo.rest.dto.VagaDTO
import com.ms_nucleo.service.VagaService
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
@RequestMapping("/api/vaga")
class VagaController {

    @Autowired
    private VagaService service


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Vaga save(@RequestBody Vaga vaga) {
        return this.service.save(vaga)
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void update(@PathVariable Integer id, @RequestBody Vaga vaga) {
        this.service.update(id, vaga)
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Integer id) {
        this.service.delete(id)
    }

    @GetMapping("{id}")
    VagaDTO getById(@PathVariable Integer id) {
        return this.service.getById(id)
    }

    @GetMapping("{id}/all")
    List<VagaDTO> findAll(@PathVariable Integer id) {
        return this.service.finAll(id)
    }
}
