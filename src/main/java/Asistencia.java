import java.util.Objects;

public class Asistencia {
    private boolean presente;
    private Estudiante estudiante;
    private SesionClase sesion;

    public Asistencia() {
    }

    public Asistencia(boolean presente, Estudiante estudiante, SesionClase sesion) {
        this.presente = presente;
        this.estudiante = estudiante;
        this.sesion = sesion;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public SesionClase getSesion() {
        return sesion;
    }

    public void setSesion(SesionClase sesion) {
        this.sesion = sesion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Asistencia that = (Asistencia) o;
        return presente == that.presente && Objects.equals(estudiante, that.estudiante) && Objects.equals(sesion, that.sesion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(presente, estudiante, sesion);
    }

    @Override
    public String toString() {
        return "Asistencia{" +
                "presente=" + presente +
                ", estudiante=" + estudiante +
                ", sesion=" + sesion +
                '}';
    }
}
