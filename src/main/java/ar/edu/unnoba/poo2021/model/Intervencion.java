package ar.edu.unnoba.poo2021.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Intervencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="fechaHoraInicio")
    private Date fechaHoraInicio;

    @Column(name="fechaHoraFin")
    private String fechaHoraFin;

    @Column(name="paciente")
    private String paciente;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="profesional")
    private String Profesional;

}
