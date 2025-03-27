package model;

import java.util.Objects;

public class Estudiante {
    private String carrera;
    private byte semestre;
    private boolean estado;
    private Usuario usuario;
    private Inscripcion inscripcion;
    private Calificacion calificacion;

    public Estudiante() {
    }

    public Estudiante(String carrera, byte semestre, boolean estado, Usuario usuario, Inscripcion inscripcion, Calificacion calificacion) {
        this.carrera = carrera;
        this.semestre = semestre;
        this.estado = estado;
        this.usuario = usuario;
        this.inscripcion = inscripcion;
        this.calificacion = calificacion;
    }

    public String getCarrera() {
        return carrera;
    }

    public byte getSemestre() {
        return semestre;
    }

    public boolean isEstado() {
        return estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Inscripcion getInscripcion() {
        return inscripcion;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return semestre == that.semestre && estado == that.estado && Objects.equals(carrera, that.carrera) && Objects.equals(usuario, that.usuario) && Objects.equals(inscripcion, that.inscripcion) && Objects.equals(calificacion, that.calificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrera, semestre, estado, usuario, inscripcion, calificacion);
    }

    @Override
    public String toString() {
        return "model.Estudiante{" +
                "carrera='" + carrera + '\'' +
                ", semestre=" + semestre +
                ", estado=" + estado +
                ", usuario=" + usuario +
                ", inscripcion=" + inscripcion +
                ", calificacion=" + calificacion +
                '}';
    }
}
