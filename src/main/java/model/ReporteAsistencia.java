package model;

import java.util.Objects;

public class ReporteAsistencia {
    private Curso curso;
    private PeriodoAcademico periodo;
    private float porcentajeAsistenciaPromedio;

    public ReporteAsistencia() {
    }

    public ReporteAsistencia(Curso curso, PeriodoAcademico periodo, float porcentajeAsistenciaPromedio) {
        this.curso = curso;
        this.periodo = periodo;
        this.porcentajeAsistenciaPromedio = porcentajeAsistenciaPromedio;
    }

    public Curso getCurso() {
        return curso;
    }

    public PeriodoAcademico getPeriodo() {
        return periodo;
    }

    public float getPorcentajeAsistenciaPromedio() {
        return porcentajeAsistenciaPromedio;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setPeriodo(PeriodoAcademico periodo) {
        this.periodo = periodo;
    }

    public void setPorcentajeAsistenciaPromedio(float porcentajeAsistenciaPromedio) {
        this.porcentajeAsistenciaPromedio = porcentajeAsistenciaPromedio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ReporteAsistencia that = (ReporteAsistencia) o;
        return Float.compare(porcentajeAsistenciaPromedio, that.porcentajeAsistenciaPromedio) == 0 && Objects.equals(curso, that.curso) && Objects.equals(periodo, that.periodo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(curso, periodo, porcentajeAsistenciaPromedio);
    }

    @Override
    public String toString() {
        return "model.ReporteAsistencia{" +
                "curso=" + curso +
                ", periodo=" + periodo +
                ", porcentajeAsistenciaPromedio=" + porcentajeAsistenciaPromedio +
                '}';
    }
}
