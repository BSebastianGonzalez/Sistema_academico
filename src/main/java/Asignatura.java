import java.util.List;
import java.util.Objects;

public class Asignatura {
    private int codigo;
    private String nombre;
    private String descripcion;
    private byte creditos;
    private List<Asignatura> prerequisitos;
    private List<Asignatura> requisitoDe;

    public Asignatura() {
    }

    public Asignatura(int codigo, String nombre, String descripcion, byte creditos, List<Asignatura> prerequisitos, List<Asignatura> requisitoDe) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creditos = creditos;
        this.prerequisitos = prerequisitos;
        this.requisitoDe = requisitoDe;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public byte getCreditos() {
        return creditos;
    }

    public void setCreditos(byte creditos) {
        this.creditos = creditos;
    }

    public List<Asignatura> getPrerequisitos() {
        return prerequisitos;
    }

    public void setPrerequisitos(List<Asignatura> prerequisitos) {
        this.prerequisitos = prerequisitos;
    }

    public List<Asignatura> getRequisitoDe() {
        return requisitoDe;
    }

    public void setRequisitoDe(List<Asignatura> requisitoDe) {
        this.requisitoDe = requisitoDe;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Asignatura that = (Asignatura) o;
        return codigo == that.codigo && creditos == that.creditos && Objects.equals(nombre, that.nombre) && Objects.equals(descripcion, that.descripcion) && Objects.equals(prerequisitos, that.prerequisitos) && Objects.equals(requisitoDe, that.requisitoDe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, descripcion, creditos, prerequisitos, requisitoDe);
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", creditos=" + creditos +
                ", prerequisitos=" + prerequisitos +
                ", requisitoDe=" + requisitoDe +
                '}';
    }
}
