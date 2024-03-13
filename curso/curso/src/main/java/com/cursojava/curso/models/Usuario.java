package com.cursojava.curso.models;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="usuarios")
public class Usuario {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private int Id;
    @Getter @Setter @Column(name = "nombre")
    private String Nombre;
    @Getter @Setter @Column(name = "apellido")
    private String Apellido;
    @Getter @Setter @Column(name = "email")
    private String Email;
    @Getter @Setter @Column(name = "password")
    private String Password;
    @Getter @Setter @Column(name = "telefono")
    private String Telefono;


}


