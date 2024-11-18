package com.idat.personalplanta.service;

import com.idat.personalplanta.model.Capacitacion;

import java.util.List;

public interface CapacitacionService {

    List<Capacitacion> ListarCapacitacion();
    void guardarCapacitacion(Capacitacion capacitacion);
    Capacitacion obtenerCapacitacionPorId(Integer id);
    void eliminarCapacitacion(Integer id);

}
