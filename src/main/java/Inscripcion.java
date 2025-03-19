import java.util.Date;
import java.util.Objects;

public class Inscripcion {
    private Date fechaInscripcion;
    private String estado;
    private Estudiante estudiante;
    private Curso curso;

    public Inscripcion() {
    }

    public Inscripcion(Date fechaInscripcion, String estado, Estudiante estudiante, Curso curso) {
        this.fechaInscripcion = fechaInscripcion;
        this.estado = estado;
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inscripcion that = (Inscripcion) o;
        return Objects.equals(fechaInscripcion, that.fechaInscripcion) && Objects.equals(estado, that.estado) && Objects.equals(estudiante, that.estudiante) && Objects.equals(curso, that.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaInscripcion, estado, estudiante, curso);
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "fechaInscripcion=" + fechaInscripcion +
                ", estado='" + estado + '\'' +
                ", estudiante=" + estudiante +
                ", curso=" + curso +
                '}';
    }
}
