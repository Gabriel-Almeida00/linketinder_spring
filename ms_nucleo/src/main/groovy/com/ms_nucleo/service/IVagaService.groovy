package com.ms_nucleo.service


import com.ms_nucleo.domain.entity.Vaga
import com.ms_nucleo.rest.dto.VagaDTO

interface IVagaService {
    Vaga save(Vaga vaga)
    void update (Integer id, Vaga vaga)
    void delete(Integer id)
    VagaDTO getById(Integer id)
    List<VagaDTO> finAll(Integer idEmprsa )
}