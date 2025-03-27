package model;

import java.util.Objects;

public class ReporteRendimientoAcademico {
    private Curso curso;
    private PeriodoAcademico periodo;
    private float promedioGeneral;
    private byte aprobado;
    private byte reprobado;

    public ReporteRendimientoAcademico() {
    }

    public ReporteRendimientoAcademico(Curso curso, PeriodoAcademico periodo, float promedioGeneral, byte aprobado, byte reprobado) {
        this.curso = curso;
        this.periodo = periodo;
        this.promedioGeneral = promedioGeneral;
        this.aprobado = aprobado;
        this.reprobado = reprobado;
    }

    public Curso getCurso() {
        return curso;
    }

    public PeriodoAcademico getPeriodo() {
        return periodo;
    }

    public float getPromedioGeneral() {
        return promedioGeneral;
    }

    public byte getAprobado() {
        return aprobado;
    }

    public byte getReprobado() {
        return reprobado;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setPeriodo(PeriodoAcademico periodo) {
        this.periodo = periodo;
    }

    public void setPromedioGeneral(float promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }

    public void setAprobado(byte aprobado) {
        this.aprobado = aprobado;
    }

    public void setReprobado(byte reprobado) {
        this.reprobado = reprobado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ReporteRendimientoAcademico that = (ReporteRendimientoAcademico) o;
        return Float.compare(promedioGeneral, that.promedioGeneral) == 0 && aprobado == that.aprobado && reprobado == that.reprobado && Objects.equals(curso, that.curso) && Objects.equals(periodo, that.periodo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(curso, periodo, promedioGeneral, aprobado, reprobado);
    }

    @Override
    public String toString() {
        return "model.ReporteRendimientoAcademico{" +
                "curso=" + curso +
                ", periodo=" + periodo +
                ", promedioGeneral=" + promedioGeneral +
                ", aprobado=" + aprobado +
                ", reprobado=" + reprobado +
                '}';
    }
}
