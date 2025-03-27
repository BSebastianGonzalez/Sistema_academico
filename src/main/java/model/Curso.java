package model;

import java.util.Objects;

public class Curso {
    private PeriodoAcademico periodoAcademico;
    private short cupoMaximo;
    private short cupoActual;
    private Asignatura asignatura;
    private SesionClase clase;
    private Profesor profesor;
    private Inscripcion inscripcion;
    private Evaluacion evaluacion;
    private RecursoAcademico recurso;

    public Curso() {
    }

    public Curso(PeriodoAcademico periodoAcademico, short cupoMaximo, short cupoActual, Asignatura asignatura, SesionClase clase, Profesor profesor, Inscripcion inscripcion, Evaluacion evaluacion, RecursoAcademico recurso) {
        this.periodoAcademico = periodoAcademico;
        this.cupoMaximo = cupoMaximo;
        this.cupoActual = cupoActual;
        this.asignatura = asignatura;
        this.clase = clase;
        this.profesor = profesor;
        this.inscripcion = inscripcion;
        this.evaluacion = evaluacion;
        this.recurso = recurso;
    }

    public PeriodoAcademico getPeriodoAcademico() {
        return periodoAcademico;
    }

    public short getCupoMaximo() {
        return cupoMaximo;
    }

    public short getCupoActual() {
        return cupoActual;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public SesionClase getClase() {
        return clase;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Inscripcion getInscripcion() {
        return inscripcion;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public RecursoAcademico getRecurso() {
        return recurso;
    }

    public void setPeriodoAcademico(PeriodoAcademico periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public void setCupoMaximo(short cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public void setCupoActual(short cupoActual) {
        this.cupoActual = cupoActual;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public void setClase(SesionClase clase) {
        this.clase = clase;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    public void setRecurso(RecursoAcademico recurso) {
        this.recurso = recurso;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return cupoMaximo == curso.cupoMaximo && cupoActual == curso.cupoActual && Objects.equals(periodoAcademico, curso.periodoAcademico) && Objects.equals(asignatura, curso.asignatura) && Objects.equals(clase, curso.clase) && Objects.equals(profesor, curso.profesor) && Objects.equals(inscripcion, curso.inscripcion) && Objects.equals(evaluacion, curso.evaluacion) && Objects.equals(recurso, curso.recurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodoAcademico, cupoMaximo, cupoActual, asignatura, clase, profesor, inscripcion, evaluacion, recurso);
    }

    @Override
    public String toString() {
        return "model.Curso{" +
                "periodoAcademico=" + periodoAcademico +
                ", cupoMaximo=" + cupoMaximo +
                ", cupoActual=" + cupoActual +
                ", asignatura=" + asignatura +
                ", clase=" + clase +
                ", profesor=" + profesor +
                ", inscripcion=" + inscripcion +
                ", evaluacion=" + evaluacion +
                ", recurso=" + recurso +
                '}';
    }
}
