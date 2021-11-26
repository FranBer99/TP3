package ar.edu.unnoba.poo2021.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;


public class Profesional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="telefono")
    private String telefono;

    @Column(name="email")
    private String email;

    @Column(name="matricula")
    private Long matricula;
}
