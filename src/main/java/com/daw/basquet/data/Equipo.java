package com.daw.basquet.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Equipo {
    @Id
    @GeneratedValue
    private Long idequipo;
    private String nombreequipo;
    private String localidad;
    private LocalDate fechacreacion;


    public Equipo() {

    }

    public Equipo(String nombreequipo, String localidad, LocalDate fechacreacion) {
        this.nombreequipo = nombreequipo;
        this.localidad = localidad;
        this.fechacreacion = fechacreacion;

    }

    public Long getIdequipo() {
        return idequipo;
    }

    public void setIdequipo(Long idequipo) {
        this.idequipo = idequipo;
    }

    public String getNombreequipo() {
        return nombreequipo;
    }

    public void setNombreequipo(String nombreequipo) {
        this.nombreequipo = nombreequipo;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(LocalDate fechacreacion) {
        this.fechacreacion = fechacreacion;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipo equipo = (Equipo) o;

        if (idequipo != null ? !idequipo.equals(equipo.idequipo) : equipo.idequipo != null) return false;
        if (nombreequipo != null ? !nombreequipo.equals(equipo.nombreequipo) : equipo.nombreequipo != null)
            return false;
        if (localidad != null ? !localidad.equals(equipo.localidad) : equipo.localidad != null) return false;
        return fechacreacion != null ? fechacreacion.equals(equipo.fechacreacion) : equipo.fechacreacion == null;
    }

    @Override
    public int hashCode() {
        int result = idequipo != null ? idequipo.hashCode() : 0;
        result = 31 * result + (nombreequipo != null ? nombreequipo.hashCode() : 0);
        result = 31 * result + (localidad != null ? localidad.hashCode() : 0);
        result = 31 * result + (fechacreacion != null ? fechacreacion.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Equipo: " +
                "Id del equipo: " + idequipo +
            ", Nombre del equipo: '" + nombreequipo + '\'' +
            ", Localidad: '" + localidad + '\'' +
            ", Fecha de creación: " + fechacreacion + "\n";
    }
}
