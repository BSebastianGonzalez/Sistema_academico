package model;

import java.util.Objects;

public class Permiso {
    private String nombre;
    private String descripcion;
    private Rol rol;

    public Permiso() {
    }

    public Permiso(String nombre, String descripcion, Rol rol) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Rol getRol() {
        return rol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Permiso permiso = (Permiso) o;
        return Objects.equals(nombre, permiso.nombre) && Objects.equals(descripcion, permiso.descripcion) && Objects.equals(rol, permiso.rol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion, rol);
    }

    @Override
    public String toString() {
        return "model.Permiso{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", rol=" + rol +
                '}';
    }
}
