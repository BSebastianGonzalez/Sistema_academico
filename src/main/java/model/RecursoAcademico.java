package model;

import java.util.Objects;

public class RecursoAcademico {
    private String nombre;
    private String tipo;
    private String ubicacion;
    private boolean disponible;
    private Curso cursoAsignado;

    public RecursoAcademico() {
    }

    public RecursoAcademico(String nombre, String tipo, String ubicacion, boolean disponible, Curso cursoAsignado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.disponible = disponible;
        this.cursoAsignado = cursoAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public Curso getCursoAsignado() {
        return cursoAsignado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setCursoAsignado(Curso cursoAsignado) {
        this.cursoAsignado = cursoAsignado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RecursoAcademico that = (RecursoAcademico) o;
        return disponible == that.disponible && Objects.equals(nombre, that.nombre) && Objects.equals(tipo, that.tipo) && Objects.equals(ubicacion, that.ubicacion) && Objects.equals(cursoAsignado, that.cursoAsignado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipo, ubicacion, disponible, cursoAsignado);
    }

    @Override
    public String toString() {
        return "model.RecursoAcademico{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", disponible=" + disponible +
                ", cursoAsignado=" + cursoAsignado +
                '}';
    }
}
