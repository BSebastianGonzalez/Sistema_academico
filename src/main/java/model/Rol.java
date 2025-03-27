package model;

import java.util.Objects;

public class Rol {
    private String nombre;
    private String descripcion;
    private Permiso permiso;
    private Usuario usuario;

    public Rol() {
    }

    public Rol(String nombre, String descripcion, Permiso permiso, Usuario usuario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.permiso = permiso;
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Permiso getPermiso() {
        return permiso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rol rol = (Rol) o;
        return Objects.equals(nombre, rol.nombre) && Objects.equals(descripcion, rol.descripcion) && Objects.equals(permiso, rol.permiso) && Objects.equals(usuario, rol.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion, permiso, usuario);
    }

    @Override
    public String toString() {
        return "model.Rol{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", permiso=" + permiso +
                ", usuario=" + usuario +
                '}';
    }
}
