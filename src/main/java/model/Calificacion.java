package model;

import java.util.Date;
import java.util.Objects;

public class Calificacion {
    private float nota;
    private Date fecha;
    private Estudiante estudiante;
    private Evaluacion evaluacion;

    public Calificacion() {
    }

    public Calificacion(float nota, Date fecha, Estudiante estudiante, Evaluacion evaluacion) {
        this.nota = nota;
        this.fecha = fecha;
        this.estudiante = estudiante;
        this.evaluacion = evaluacion;
    }

    public float getNota() {
        return nota;
    }

    public Date getFecha() {
        return fecha;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Calificacion that = (Calificacion) o;
        return Float.compare(nota, that.nota) == 0 && Objects.equals(fecha, that.fecha) && Objects.equals(estudiante, that.estudiante) && Objects.equals(evaluacion, that.evaluacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nota, fecha, estudiante, evaluacion);
    }

    @Override
    public String toString() {
        return "model.Calificacion{" +
                "nota=" + nota +
                ", fecha=" + fecha +
                ", estudiante=" + estudiante +
                ", evaluacion=" + evaluacion +
                '}';
    }
}
