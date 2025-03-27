package model;

import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

public class SesionClase {
    private Date fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String tema;
    private Curso curso;
    private Aula aula;
    private Asistencia registroAsistencia;

    public SesionClase() {
    }

    public SesionClase(Date fecha, LocalTime horaInicio, LocalTime horaFin, String tema, Curso curso, Aula aula, Asistencia registroAsistencia) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tema = tema;
        this.curso = curso;
        this.aula = aula;
        this.registroAsistencia = registroAsistencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public String getTema() {
        return tema;
    }

    public Curso getCurso() {
        return curso;
    }

    public Aula getAula() {
        return aula;
    }

    public Asistencia getRegistroAsistencia() {
        return registroAsistencia;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public void setRegistroAsistencia(Asistencia registroAsistencia) {
        this.registroAsistencia = registroAsistencia;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SesionClase that = (SesionClase) o;
        return Objects.equals(fecha, that.fecha) && Objects.equals(horaInicio, that.horaInicio) && Objects.equals(horaFin, that.horaFin) && Objects.equals(tema, that.tema) && Objects.equals(curso, that.curso) && Objects.equals(aula, that.aula) && Objects.equals(registroAsistencia, that.registroAsistencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha, horaInicio, horaFin, tema, curso, aula, registroAsistencia);
    }

    @Override
    public String toString() {
        return "model.SesionClase{" +
                "fecha=" + fecha +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", tema='" + tema + '\'' +
                ", curso=" + curso +
                ", aula=" + aula +
                ", registroAsistencia=" + registroAsistencia +
                '}';
    }
}
