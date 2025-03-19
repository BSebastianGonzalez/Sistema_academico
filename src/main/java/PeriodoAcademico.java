import java.util.Date;
import java.util.List;
import java.util.Objects;

public class PeriodoAcademico {
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private List<Curso> cursos;

    public PeriodoAcademico() {
    }

    public PeriodoAcademico(String nombre, Date fechaInicio, Date fechaFin, List<Curso> cursos) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cursos = cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PeriodoAcademico that = (PeriodoAcademico) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(fechaInicio, that.fechaInicio) && Objects.equals(fechaFin, that.fechaFin) && Objects.equals(cursos, that.cursos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, fechaInicio, fechaFin, cursos);
    }

    @Override
    public String toString() {
        return "PeriodoAcademico{" +
                "nombre='" + nombre + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", cursos=" + cursos +
                '}';
    }
}
