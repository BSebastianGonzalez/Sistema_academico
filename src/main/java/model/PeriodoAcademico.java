package model;

import java.util.Date;
import java.util.Objects;

public class PeriodoAcademico {
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private Curso curso;

    public PeriodoAcademico() {
    }

    public PeriodoAcademico(String nombre, Date fechaInicio, Date fechaFin, Curso curso) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PeriodoAcademico that = (PeriodoAcademico) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(fechaInicio, that.fechaInicio) && Objects.equals(fechaFin, that.fechaFin) && Objects.equals(curso, that.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, fechaInicio, fechaFin, curso);
    }

    @Override
    public String toString() {
        return "model.PeriodoAcademico{" +
                "nombre='" + nombre + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", curso=" + curso +
                '}';
    }
}
