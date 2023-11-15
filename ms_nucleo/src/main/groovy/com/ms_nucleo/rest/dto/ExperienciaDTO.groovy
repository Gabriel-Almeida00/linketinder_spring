package com.ms_nucleo.rest.dto


import com.ms_nucleo.domain.enums.ExperienciaNivel

class ExperienciaDTO {

    private Integer id
    private String cargo
    private String empresa
    private ExperienciaNivel nivel

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    String getCargo() {
        return cargo
    }

    void setCargo(String cargo) {
        this.cargo = cargo
    }

    String getEmpresa() {
        return empresa
    }

    void setEmpresa(String empresa) {
        this.empresa = empresa
    }

    ExperienciaNivel getNivel() {
        return nivel
    }

    void setNivel(ExperienciaNivel nivel) {
        this.nivel = nivel
    }

    ExperienciaDTO(Integer id, String cargo, String empresa, ExperienciaNivel nivel) {
        this.id = id
        this.cargo = cargo
        this.empresa = empresa
        this.nivel = nivel
    }
}
