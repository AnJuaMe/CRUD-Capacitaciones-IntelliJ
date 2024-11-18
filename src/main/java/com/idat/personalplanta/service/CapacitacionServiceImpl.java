package com.idat.personalplanta.service;

import com.idat.personalplanta.model.Capacitacion;
import com.idat.personalplanta.repository.CapacitacionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CapacitacionServiceImpl implements CapacitacionService {

    private final CapacitacionRepository capacitacionRepository;


    @Override
    public List<Capacitacion> ListarCapacitacion() { return capacitacionRepository.findAll(); }


    @Override
    public void guardarCapacitacion(Capacitacion capacitacion) { capacitacionRepository.save(capacitacion); }


    @Override
    public Capacitacion obtenerCapacitacionPorId(Integer id) {return capacitacionRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("No existe un capacitacion con el id: " + id));}

    @Override
    public void eliminarCapacitacion(Integer id) {
        if (capacitacionRepository.existsById(id)) {
            capacitacionRepository.deleteById(id);
        } else {
            throw new RuntimeException("No existe un capacitacion con el id: " + id);
        }

    }
}
