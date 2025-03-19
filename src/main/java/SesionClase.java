import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class SesionClase {
    private Date fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String tema;
    private Curso curso;
    private Aula aula;
    private List<Asistencia> registroAsistencias;

    public SesionClase() {
    }

    public SesionClase(Date fecha, LocalTime horaInicio, LocalTime horaFin, String tema, Curso curso, Aula aula, List<Asistencia> registroAsistencias) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tema = tema;
        this.curso = curso;
        this.aula = aula;
        this.registroAsistencias = registroAsistencias;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public List<Asistencia> getRegistroAsistencias() {
        return registroAsistencias;
    }

    public void setRegistroAsistencias(List<Asistencia> registroAsistencias) {
        this.registroAsistencias = registroAsistencias;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SesionClase that = (SesionClase) o;
        return Objects.equals(fecha, that.fecha) && Objects.equals(horaInicio, that.horaInicio) && Objects.equals(horaFin, that.horaFin) && Objects.equals(tema, that.tema) && Objects.equals(curso, that.curso) && Objects.equals(aula, that.aula) && Objects.equals(registroAsistencias, that.registroAsistencias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha, horaInicio, horaFin, tema, curso, aula, registroAsistencias);
    }

    @Override
    public String toString() {
        return "SesionClase{" +
                "fecha=" + fecha +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", tema='" + tema + '\'' +
                ", curso=" + curso +
                ", aula=" + aula +
                ", registroAsistencias=" + registroAsistencias +
                '}';
    }
}
