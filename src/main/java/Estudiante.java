import java.util.List;
import java.util.Objects;

public class Estudiante {
    private String carrera;
    private byte semestre;
    private boolean estado;
    private Usuario usuario;
    private List<Inscripcion> inscripciones;
    private List<Calificacion> calificaciones;

    public Estudiante() {
    }

    public Estudiante(String carrera, byte semestre, boolean estado, Usuario usuario, List<Inscripcion> inscripciones, List<Calificacion> calificaciones) {
        this.carrera = carrera;
        this.semestre = semestre;
        this.estado = estado;
        this.usuario = usuario;
        this.inscripciones = inscripciones;
        this.calificaciones = calificaciones;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(List<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return semestre == that.semestre && estado == that.estado && Objects.equals(carrera, that.carrera) && Objects.equals(usuario, that.usuario) && Objects.equals(inscripciones, that.inscripciones) && Objects.equals(calificaciones, that.calificaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrera, semestre, estado, usuario, inscripciones, calificaciones);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                ", semestre=" + semestre +
                ", estado=" + estado +
                ", usuario=" + usuario +
                ", inscripciones=" + inscripciones +
                ", calificaciones=" + calificaciones +
                '}';
    }
}
