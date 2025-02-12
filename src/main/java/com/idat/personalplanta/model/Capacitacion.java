package com.idat.personalplanta.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "tb_capacitacion")
@Data
@Getter
@Setter
public class Capacitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_capacitacion")
    private Integer id;

    @Column(name = "des_capacitacion", length = 200, nullable = false)
    private String desCapacitacion;

    @Column(name = "fecha_inicio", nullable = false)
    @Temporal(value = TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    @Temporal(value = TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaFin;

    @Column(name = "estado", nullable = false)
    private Integer estado;

    @Column(name = "creditos", nullable = false)
    private Integer creditos;


}

