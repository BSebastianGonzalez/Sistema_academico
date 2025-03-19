import java.util.Date;
import java.util.List;
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
    private List<Rol> roles;
    private List<Mensaje> mensajesEnviados;
    private List<Mensaje> mensajesRecibidos;
    private List<Notificacion> notificaciones;
    private Date ultimoAcceso;
    private boolean activo;

    public Usuario() {
    }

    public Usuario(String cedula, String nombre, String apellido, String correo, String contrasenia, Date fechaNacimiento, String direccion, long telefono, List<Rol> roles, List<Mensaje> mensajesEnviados, List<Mensaje> mensajesRecibidos, List<Notificacion> notificaciones, Date ultimoAcceso, boolean activo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.roles = roles;
        this.mensajesEnviados = mensajesEnviados;
        this.mensajesRecibidos = mensajesRecibidos;
        this.notificaciones = notificaciones;
        this.ultimoAcceso = ultimoAcceso;
        this.activo = activo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    public List<Mensaje> getMensajesEnviados() {
        return mensajesEnviados;
    }

    public void setMensajesEnviados(List<Mensaje> mensajesEnviados) {
        this.mensajesEnviados = mensajesEnviados;
    }

    public List<Mensaje> getMensajesRecibidos() {
        return mensajesRecibidos;
    }

    public void setMensajesRecibidos(List<Mensaje> mensajesRecibidos) {
        this.mensajesRecibidos = mensajesRecibidos;
    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public Date getUltimoAcceso() {
        return ultimoAcceso;
    }

    public void setUltimoAcceso(Date ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return telefono == usuario.telefono && activo == usuario.activo && Objects.equals(cedula, usuario.cedula) && Objects.equals(nombre, usuario.nombre) && Objects.equals(apellido, usuario.apellido) && Objects.equals(correo, usuario.correo) && Objects.equals(contrasenia, usuario.contrasenia) && Objects.equals(fechaNacimiento, usuario.fechaNacimiento) && Objects.equals(direccion, usuario.direccion) && Objects.equals(roles, usuario.roles) && Objects.equals(mensajesEnviados, usuario.mensajesEnviados) && Objects.equals(mensajesRecibidos, usuario.mensajesRecibidos) && Objects.equals(notificaciones, usuario.notificaciones) && Objects.equals(ultimoAcceso, usuario.ultimoAcceso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula, nombre, apellido, correo, contrasenia, fechaNacimiento, direccion, telefono, roles, mensajesEnviados, mensajesRecibidos, notificaciones, ultimoAcceso, activo);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", roles=" + roles +
                ", mensajesEnviados=" + mensajesEnviados +
                ", mensajesRecibidos=" + mensajesRecibidos +
                ", notificaciones=" + notificaciones +
                ", ultimoAcceso=" + ultimoAcceso +
                ", activo=" + activo +
                '}';
    }
}
