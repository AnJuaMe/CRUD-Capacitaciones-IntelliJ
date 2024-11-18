package com.idat.personalplanta.repository;


import com.idat.personalplanta.model.Capacitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CapacitacionRepository extends JpaRepository<Capacitacion, Integer> {
}
