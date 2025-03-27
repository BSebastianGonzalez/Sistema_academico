package model;

import java.util.Date;
import java.util.Objects;

public class Notificacion {
    private String titulo;
    private String contenido;
    private Date fechaCreacion;
    private String descripcion;
    private boolean enviado;
    private Usuario destinatario;

    public Notificacion() {
    }

    public Notificacion(String titulo, String contenido, Date fechaCreacion, String descripcion, boolean enviado, Usuario destinatario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
        this.descripcion = descripcion;
        this.enviado = enviado;
        this.destinatario = destinatario;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Notificacion that = (Notificacion) o;
        return enviado == that.enviado && Objects.equals(titulo, that.titulo) && Objects.equals(contenido, that.contenido) && Objects.equals(fechaCreacion, that.fechaCreacion) && Objects.equals(descripcion, that.descripcion) && Objects.equals(destinatario, that.destinatario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, contenido, fechaCreacion, descripcion, enviado, destinatario);
    }

    @Override
    public String toString() {
        return "model.Notificacion{" +
                "titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", descripcion='" + descripcion + '\'' +
                ", enviado=" + enviado +
                ", destinatario=" + destinatario +
                '}';
    }
}
