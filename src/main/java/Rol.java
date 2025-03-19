import java.util.List;
import java.util.Objects;

public class Rol {
    private String nombre;
    private String descripcion;
    private List<Permiso> permisos;
    private List<Usuario> usuarios;

    public Rol() {
    }

    public Rol(String nombre, String descripcion, List<Permiso> permisos, List<Usuario> usuarios) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.permisos = permisos;
        this.usuarios = usuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(List<Permiso> permisos) {
        this.permisos = permisos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rol rol = (Rol) o;
        return Objects.equals(nombre, rol.nombre) && Objects.equals(descripcion, rol.descripcion) && Objects.equals(permisos, rol.permisos) && Objects.equals(usuarios, rol.usuarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion, permisos, usuarios);
    }

    @Override
    public String toString() {
        return "Rol{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", permisos=" + permisos +
                ", usuarios=" + usuarios +
                '}';
    }
}
