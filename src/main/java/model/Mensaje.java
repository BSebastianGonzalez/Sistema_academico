package model;

import java.util.Date;
import java.util.Objects;

public class Mensaje {
    private String asunto;
    private String contenido;
    private Date fechaEnvio;
    private boolean leido;
    private Usuario remitente;
    private Usuario destinatario;

    public Mensaje() {
    }

    public Mensaje(String asunto, String contenido, Date fechaEnvio, boolean leido, Usuario remitente, Usuario destinatario) {
        this.asunto = asunto;
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
        this.leido = leido;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public boolean isLeido() {
        return leido;
    }

    public Usuario getRemitente() {
        return remitente;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public void setRemitente(Usuario remitente) {
        this.remitente = remitente;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mensaje mensaje = (Mensaje) o;
        return leido == mensaje.leido && Objects.equals(asunto, mensaje.asunto) && Objects.equals(contenido, mensaje.contenido) && Objects.equals(fechaEnvio, mensaje.fechaEnvio) && Objects.equals(remitente, mensaje.remitente) && Objects.equals(destinatario, mensaje.destinatario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asunto, contenido, fechaEnvio, leido, remitente, destinatario);
    }

    @Override
    public String toString() {
        return "model.Mensaje{" +
                "asunto='" + asunto + '\'' +
                ", contenido='" + contenido + '\'' +
                ", fechaEnvio=" + fechaEnvio +
                ", leido=" + leido +
                ", remitente=" + remitente +
                ", destinatario=" + destinatario +
                '}';
    }
}
