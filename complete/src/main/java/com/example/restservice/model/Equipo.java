package com.example.restservice.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table( name="equipo")
public class Equipo implements Serializable {
    @Id
    @Column(name = "idequipo")
    int idEquipo;
    @Column(name = "nombre")
    String nombre;
    @Column(name = "liga")
    String liga;
    //@OneToMany(mappedBy = "equipo")
    //private List<Jugador> jugadoresEquipo;

    public Equipo(String nombre, String liga, int idEquipo) {
        this.nombre = nombre;
        this.liga = liga;
        this.idEquipo = idEquipo;

    }

    public Equipo() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", liga='" + liga + '\'' +
                ", idEquipo=" + idEquipo +
                '}';
    }
}