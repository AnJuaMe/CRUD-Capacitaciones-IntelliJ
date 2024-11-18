package com.idat.personalplanta.repository;


import com.idat.personalplanta.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRespository extends JpaRepository<Empleado, Integer> {
}
