import java.util.Objects;

public class ReporteRendimientoAcademico {
    private Curso curso;
    private PeriodoAcademico periodo;
    private float promedioGeneral;
    private byte aprobados;
    private byte reprobados;

    public ReporteRendimientoAcademico() {
    }

    public ReporteRendimientoAcademico(Curso curso, PeriodoAcademico periodo, float promedioGeneral, byte aprobados, byte reprobados) {
        this.curso = curso;
        this.periodo = periodo;
        this.promedioGeneral = promedioGeneral;
        this.aprobados = aprobados;
        this.reprobados = reprobados;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public PeriodoAcademico getPeriodo() {
        return periodo;
    }

    public void setPeriodo(PeriodoAcademico periodo) {
        this.periodo = periodo;
    }

    public float getPromedioGeneral() {
        return promedioGeneral;
    }

    public void setPromedioGeneral(float promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }

    public byte getAprobados() {
        return aprobados;
    }

    public void setAprobados(byte aprobados) {
        this.aprobados = aprobados;
    }

    public byte getReprobados() {
        return reprobados;
    }

    public void setReprobados(byte reprobados) {
        this.reprobados = reprobados;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ReporteRendimientoAcademico that = (ReporteRendimientoAcademico) o;
        return Float.compare(promedioGeneral, that.promedioGeneral) == 0 && aprobados == that.aprobados && reprobados == that.reprobados && Objects.equals(curso, that.curso) && Objects.equals(periodo, that.periodo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(curso, periodo, promedioGeneral, aprobados, reprobados);
    }

    @Override
    public String toString() {
        return "ReporteRendimientoAcademico{" +
                "curso=" + curso +
                ", periodo=" + periodo +
                ", promedioGeneral=" + promedioGeneral +
                ", aprobados=" + aprobados +
                ", reprobados=" + reprobados +
                '}';
    }
}
