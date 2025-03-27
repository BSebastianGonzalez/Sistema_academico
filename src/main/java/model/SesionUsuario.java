package model;

import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

public class SesionUsuario {
    private Usuario usuario;
    private String token;
    private Date fechaInicio;
    private Date fechaExpiracion;
    private LocalTime horaInicio;
    private LocalTime horaExpiracion;
    private String ip;
    private String dispositivo;

    public SesionUsuario() {
    }

    public SesionUsuario(Usuario usuario, String token, Date fechaInicio, Date fechaExpiracion, LocalTime horaInicio, LocalTime horaExpiracion, String ip, String dispositivo) {
        this.usuario = usuario;
        this.token = token;
        this.fechaInicio = fechaInicio;
        this.fechaExpiracion = fechaExpiracion;
        this.horaInicio = horaInicio;
        this.horaExpiracion = horaExpiracion;
        this.ip = ip;
        this.dispositivo = dispositivo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getToken() {
        return token;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public LocalTime getHoraExpiracion() {
        return horaExpiracion;
    }

    public String getIp() {
        return ip;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraExpiracion(LocalTime horaExpiracion) {
        this.horaExpiracion = horaExpiracion;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SesionUsuario that = (SesionUsuario) o;
        return Objects.equals(usuario, that.usuario) && Objects.equals(token, that.token) && Objects.equals(fechaInicio, that.fechaInicio) && Objects.equals(fechaExpiracion, that.fechaExpiracion) && Objects.equals(horaInicio, that.horaInicio) && Objects.equals(horaExpiracion, that.horaExpiracion) && Objects.equals(ip, that.ip) && Objects.equals(dispositivo, that.dispositivo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, token, fechaInicio, fechaExpiracion, horaInicio, horaExpiracion, ip, dispositivo);
    }

    @Override
    public String toString() {
        return "model.SesionUsuario{" +
                "usuario=" + usuario +
                ", token='" + token + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaExpiracion=" + fechaExpiracion +
                ", horaInicio=" + horaInicio +
                ", horaExpiracion=" + horaExpiracion +
                ", ip='" + ip + '\'' +
                ", dispositivo='" + dispositivo + '\'' +
                '}';
    }
}
