package com.daw.basquet.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Jugador {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private LocalDate fechaNcimiento;
    private Integer numCanastas;
    private Integer numRebotes;
    private Integer numAsistencias;
    private String posicion;

    @ManyToOne
    private Equipo equipo;



    public Jugador(){

    }

    public Jugador(String nombre, LocalDate fechaNcimiento, Integer numCanastas, Integer numRebotes, Integer numAsistencias, String posicion) {
        this.nombre = nombre;
        this.fechaNcimiento = fechaNcimiento;
        this.numCanastas = numCanastas;
        this.numRebotes = numRebotes;
        this.numAsistencias = numAsistencias;
        this.posicion = posicion;

    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {

        this.equipo = equipo;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNcimiento() {
        return fechaNcimiento;
    }

    public void setFechaNcimiento(LocalDate fechaNcimiento) {
        this.fechaNcimiento = fechaNcimiento;
    }

    public Integer getNumCanastas() {
        return numCanastas;
    }

    public void setNumCanastas(Integer numCanastas) {
        this.numCanastas = numCanastas;
    }

    public Integer getNumRebotes() {
        return numRebotes;
    }

    public void setNumRebotes(Integer numRebotes) {
        this.numRebotes = numRebotes;
    }

    public Integer getNumAsistencias() {
        return numAsistencias;
    }

    public void setNumAsistencias(Integer numAsistencias) {
        this.numAsistencias = numAsistencias;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jugador Jugador = (Jugador) o;

        if (id != null ? !id.equals(Jugador.id) : Jugador.id != null) return false;
        if (nombre != null ? !nombre.equals(Jugador.nombre) : Jugador.nombre != null) return false;
        if (fechaNcimiento != null ? !fechaNcimiento.equals(Jugador.fechaNcimiento) : Jugador.fechaNcimiento != null)
            return false;
        if (numCanastas != null ? !numCanastas.equals(Jugador.numCanastas) : Jugador.numCanastas != null) return false;
        if (numRebotes != null ? !numRebotes.equals(Jugador.numRebotes) : Jugador.numRebotes != null) return false;
        if (numAsistencias !=null ? !numAsistencias.equals(Jugador.numAsistencias) : Jugador.numAsistencias != null) return false;
        return posicion != null ? posicion.equals(Jugador.posicion) : Jugador.posicion == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (fechaNcimiento != null ? fechaNcimiento.hashCode() : 0);
        result = 31 * result + (numCanastas != null ? numCanastas.hashCode() : 0);
        result = 31 * result + (numRebotes != null ? numRebotes.hashCode() : 0);
        result = 31 * result + (numAsistencias != null ? numAsistencias.hashCode() : 0);
        result = 31 * result + (posicion != null ? posicion.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Jugador: " +
                "id: " + id +
                ", Nombre: '" + nombre + '\'' +
                ", Fecha de nacimiento: " + fechaNcimiento +
                ", Número de canastas: " + numCanastas +
                ", Número de rebotes: " + numRebotes +
                ", Número de asistencias: " + numAsistencias +
                ", Posicion: '" + posicion + "'\n"
                ;
    }
}

