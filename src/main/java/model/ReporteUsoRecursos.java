package model;

import java.util.Objects;

public class ReporteUsoRecursos {
    private PeriodoAcademico periodo;
    private RecursoAcademico recurso;
    private float tasaUtilizacion;

    public ReporteUsoRecursos() {
    }

    public ReporteUsoRecursos(PeriodoAcademico periodo, RecursoAcademico recurso, float tasaUtilizacion) {
        this.periodo = periodo;
        this.recurso = recurso;
        this.tasaUtilizacion = tasaUtilizacion;
    }

    public PeriodoAcademico getPeriodo() {
        return periodo;
    }

    public RecursoAcademico getRecurso() {
        return recurso;
    }

    public float getTasaUtilizacion() {
        return tasaUtilizacion;
    }

    public void setPeriodo(PeriodoAcademico periodo) {
        this.periodo = periodo;
    }

    public void setRecurso(RecursoAcademico recurso) {
        this.recurso = recurso;
    }

    public void setTasaUtilizacion(float tasaUtilizacion) {
        this.tasaUtilizacion = tasaUtilizacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ReporteUsoRecursos that = (ReporteUsoRecursos) o;
        return Float.compare(tasaUtilizacion, that.tasaUtilizacion) == 0 && Objects.equals(periodo, that.periodo) && Objects.equals(recurso, that.recurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodo, recurso, tasaUtilizacion);
    }

    @Override
    public String toString() {
        return "model.ReporteUsoRecursos{" +
                "periodo=" + periodo +
                ", recurso=" + recurso +
                ", tasaUtilizacion=" + tasaUtilizacion +
                '}';
    }
}
