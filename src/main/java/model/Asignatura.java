package model;

import java.util.Objects;

public class Asignatura {
    private int codigo;
    private String nombre;
    private String descripcion;
    private byte creditos;

    public Asignatura() {
    }

    public Asignatura(int codigo, String nombre, String descripcion, byte creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creditos = creditos;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public byte getCreditos() {
        return creditos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCreditos(byte creditos) {
        this.creditos = creditos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Asignatura that = (Asignatura) o;
        return codigo == that.codigo && creditos == that.creditos && Objects.equals(nombre, that.nombre) && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, descripcion, creditos);
    }

    @Override
    public String toString() {
        return "model.Asignatura{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", creditos=" + creditos +
                '}';
    }
}
