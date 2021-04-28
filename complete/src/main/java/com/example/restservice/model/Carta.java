package com.example.restservice.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table( name="carta")
public class Carta  {
    @Id
    @Column(name = "idcarta")
    int idCarta;
    @Column(name ="nombretipo")
    String nombreTipo;
    @Column(name = "fechalanzamiento")
    Date fechaLanzamiento;

    //@OneToMany(mappedBy = "carta")
    //private List<Jugador> jugadorList;

    public Carta() {
    }

    public Carta(String nombreTipo, Date fechaLanzamiento, int idCarta) {
        this.nombreTipo = nombreTipo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.idCarta = idCarta;

    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getIdCarta() {
        return idCarta;
    }

    public void setIdCarta(int idCarta) {
        this.idCarta = idCarta;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "nombreTipo='" + nombreTipo + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", idCarta=" + idCarta +
                '}';
    }
}