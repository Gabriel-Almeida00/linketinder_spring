package com.ms_nucleo.domain.repository

import com.ms_nucleo.domain.entity.Empresa
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmpresaRepository extends JpaRepository<Empresa, Integer>{

}