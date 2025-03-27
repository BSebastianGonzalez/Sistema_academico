package model;

import java.util.Date;
import java.util.Objects;

public class RestablecimientoContrasenia {
    private Usuario usuario;
    private String token;
    private Date fechaCreacion;
    private Date fechaExpiracion;
    private boolean utilizado;

    public RestablecimientoContrasenia() {
    }

    public RestablecimientoContrasenia(Usuario usuario, String token, Date fechaCreacion, Date fechaExpiracion, boolean utilizado) {
        this.usuario = usuario;
        this.token = token;
        this.fechaCreacion = fechaCreacion;
        this.fechaExpiracion = fechaExpiracion;
        this.utilizado = utilizado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getToken() {
        return token;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public boolean isUtilizado() {
        return utilizado;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public void setUtilizado(boolean utilizado) {
        this.utilizado = utilizado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RestablecimientoContrasenia that = (RestablecimientoContrasenia) o;
        return utilizado == that.utilizado && Objects.equals(usuario, that.usuario) && Objects.equals(token, that.token) && Objects.equals(fechaCreacion, that.fechaCreacion) && Objects.equals(fechaExpiracion, that.fechaExpiracion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, token, fechaCreacion, fechaExpiracion, utilizado);
    }

    @Override
    public String toString() {
        return "model.RestablecimientoContrasenia{" +
                "usuario=" + usuario +
                ", token='" + token + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaExpiracion=" + fechaExpiracion +
                ", utilizado=" + utilizado +
                '}';
    }
}
