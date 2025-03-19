import java.util.List;
import java.util.Objects;

public class ReporteUsoRecursos {
    private PeriodoAcademico periodo;
    private List<RecursoAcademico> recursos;
    private float tasaUtilizacion;

    public ReporteUsoRecursos() {
    }

    public ReporteUsoRecursos(PeriodoAcademico periodo, List<RecursoAcademico> recursos, float tasaUtilizacion) {
        this.periodo = periodo;
        this.recursos = recursos;
        this.tasaUtilizacion = tasaUtilizacion;
    }

    public PeriodoAcademico getPeriodo() {
        return periodo;
    }

    public void setPeriodo(PeriodoAcademico periodo) {
        this.periodo = periodo;
    }

    public List<RecursoAcademico> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<RecursoAcademico> recursos) {
        this.recursos = recursos;
    }

    public float getTasaUtilizacion() {
        return tasaUtilizacion;
    }

    public void setTasaUtilizacion(float tasaUtilizacion) {
        this.tasaUtilizacion = tasaUtilizacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ReporteUsoRecursos that = (ReporteUsoRecursos) o;
        return Float.compare(tasaUtilizacion, that.tasaUtilizacion) == 0 && Objects.equals(periodo, that.periodo) && Objects.equals(recursos, that.recursos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodo, recursos, tasaUtilizacion);
    }

    @Override
    public String toString() {
        return "ReporteUsoRecursos{" +
                "periodo=" + periodo +
                ", recursos=" + recursos +
                ", tasaUtilizacion=" + tasaUtilizacion +
                '}';
    }
}
