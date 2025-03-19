import java.util.List;
import java.util.Objects;

public class Curso {
    private PeriodoAcademico periodoAcademico;
    private short cupoMaximo;
    private short cupoActual;
    private Asignatura asignatura;
    private List<SesionClase> clases;
    private List<Profesor>  profesores;
    private List<Inscripcion> inscripciones;
    private List<Evaluacion> evaluaciones;
    private List<RecursoAcademico> recursos;

    public Curso() {
    }

    public PeriodoAcademico getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(PeriodoAcademico periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public short getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(short cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public short getCupoActual() {
        return cupoActual;
    }

    public void setCupoActual(short cupoActual) {
        this.cupoActual = cupoActual;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public List<SesionClase> getClases() {
        return clases;
    }

    public void setClases(List<SesionClase> clases) {
        this.clases = clases;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(List<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }

    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(List<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public List<RecursoAcademico> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<RecursoAcademico> recursos) {
        this.recursos = recursos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return cupoMaximo == curso.cupoMaximo && cupoActual == curso.cupoActual && Objects.equals(periodoAcademico, curso.periodoAcademico) && Objects.equals(asignatura, curso.asignatura) && Objects.equals(clases, curso.clases) && Objects.equals(profesores, curso.profesores) && Objects.equals(inscripciones, curso.inscripciones) && Objects.equals(evaluaciones, curso.evaluaciones) && Objects.equals(recursos, curso.recursos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodoAcademico, cupoMaximo, cupoActual, asignatura, clases, profesores, inscripciones, evaluaciones, recursos);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "periodoAcademico=" + periodoAcademico +
                ", cupoMaximo=" + cupoMaximo +
                ", cupoActual=" + cupoActual +
                ", asignatura=" + asignatura +
                ", clases=" + clases +
                ", profesores=" + profesores +
                ", inscripciones=" + inscripciones +
                ", evaluaciones=" + evaluaciones +
                ", recursos=" + recursos +
                '}';
    }
}
