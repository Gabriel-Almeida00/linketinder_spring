package com.ms_nucleo.service


import com.ms_nucleo.domain.entity.Empresa

interface IEmpresaService {
    Empresa save(Empresa empresa)
    void update (Integer id, Empresa empresa)
    void delete(Integer id)
    Empresa getById(Integer id)
    List<Empresa> finAll( )
}