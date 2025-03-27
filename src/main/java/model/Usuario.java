package model;

import java.util.Date;
import java.util.Objects;

public class Usuario {
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasenia;
    private Date fechaNacimiento;
    private String direccion;
    private long telefono;
    private Rol roles;
    private Mensaje mensajeEnviado;
    private Mensaje mensajeRecibido;
    private Notificacion notificacion;
    private Date ultimoAcceso;
    private boolean activo;

    public Usuario() {
    }

    public Usuario(String cedula, String nombre, String apellido, String correo, String contrasenia, Date fechaNacimiento, String direccion, long telefono, Rol roles, Mensaje mensajeEnviado, Mensaje mensajeRecibido, Notificacion notificacion, Date ultimoAcceso, boolean activo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.roles = roles;
        this.mensajeEnviado = mensajeEnviado;
        this.mensajeRecibido = mensajeRecibido;
        this.notificacion = notificacion;
        this.ultimoAcceso = ultimoAcceso;
        this.activo = activo;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public Rol getRoles() {
        return roles;
    }

    public Mensaje getMensajeEnviado() {
        return mensajeEnviado;
    }

    public Mensaje getMensajeRecibido() {
        return mensajeRecibido;
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public Date getUltimoAcceso() {
        return ultimoAcceso;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setRoles(Rol roles) {
        this.roles = roles;
    }

    public void setMensajeEnviado(Mensaje mensajeEnviado) {
        this.mensajeEnviado = mensajeEnviado;
    }

    public void setMensajeRecibido(Mensaje mensajeRecibido) {
        this.mensajeRecibido = mensajeRecibido;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void setUltimoAcceso(Date ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return telefono == usuario.telefono && activo == usuario.activo && Objects.equals(cedula, usuario.cedula) && Objects.equals(nombre, usuario.nombre) && Objects.equals(apellido, usuario.apellido) && Objects.equals(correo, usuario.correo) && Objects.equals(contrasenia, usuario.contrasenia) && Objects.equals(fechaNacimiento, usuario.fechaNacimiento) && Objects.equals(direccion, usuario.direccion) && Objects.equals(roles, usuario.roles) && Objects.equals(mensajeEnviado, usuario.mensajeEnviado) && Objects.equals(mensajeRecibido, usuario.mensajeRecibido) && Objects.equals(notificacion, usuario.notificacion) && Objects.equals(ultimoAcceso, usuario.ultimoAcceso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula, nombre, apellido, correo, contrasenia, fechaNacimiento, direccion, telefono, roles, mensajeEnviado, mensajeRecibido, notificacion, ultimoAcceso, activo);
    }

    @Override
    public String toString() {
        return "model.Usuario{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", roles=" + roles +
                ", mensajeEnviado=" + mensajeEnviado +
                ", mensajeRecibido=" + mensajeRecibido +
                ", notificacion=" + notificacion +
                ", ultimoAcceso=" + ultimoAcceso +
                ", activo=" + activo +
                '}';
    }
}
