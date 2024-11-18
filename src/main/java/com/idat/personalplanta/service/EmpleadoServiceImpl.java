package com.idat.personalplanta.service;

import com.idat.personalplanta.model.Empleado;
import com.idat.personalplanta.repository.EmpleadoRespository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoRespository empleadoRespository;


    @Override
    public List<Empleado> listarEmpleados() { return empleadoRespository.findAll(); }

    @Override
    public void guardarEmpleado(Empleado empleado) { empleadoRespository.save(empleado); }

    @Override
    public Empleado obtenerEmpleadoPorId(Integer id) { return empleadoRespository.findById(id)
            .orElseThrow(() -> new RuntimeException("Empleado no encontrado para el id: " + id)); }

    @Override
    public void eliminarEmpleado(Integer id) {
        if (empleadoRespository.existsById(id)) {
            empleadoRespository.deleteById(id);
        } else {
            throw new RuntimeException("Empleado no encontrado para el id: " + id);
        }

    }
}
