package com.idat.personalplanta.controller;

import com.idat.personalplanta.model.Capacitacion;
import com.idat.personalplanta.service.CapacitacionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/capacitaciones")
@AllArgsConstructor
public class CapacitacionController {

    private final CapacitacionService capacitacionService;

    @GetMapping("/listarCapacitaciones")
    public String visualizarCapacitaciones(Model model) {
        model.addAttribute("listarCapacitacion", capacitacionService.ListarCapacitacion());
        return "empleados/capacitaciones/capacitaciones";
    }

    @GetMapping("/nuevaCapacitacion")
    public String nuevaCapacitacion(Model model) {
        model.addAttribute("capacitacion", new Capacitacion());
        return "empleados/capacitaciones/nuevaCapacitacion";
    }

    @PostMapping("/guardarCapacitacion")
    public String guardarCapacitacion(@ModelAttribute("capacitacion") Capacitacion capacitacion) {
        capacitacionService.guardarCapacitacion(capacitacion);
        return "redirect:/capacitaciones/listarCapacitaciones";
    }

    @GetMapping("/actualizarCapacitacion/{id}")
    public String actualizarCapacitacion(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("capacitacion", capacitacionService.obtenerCapacitacionPorId(id));
        return "empleados/capacitaciones/actualizarCapacitacion";
    }

    @GetMapping("/eliminarCapacitacion/{id}")
    public String eliminarCapacitacion(@PathVariable("id") Integer id) {
        capacitacionService.eliminarCapacitacion(id);
        return "redirect:/capacitaciones/listarCapacitaciones";
    }
}
