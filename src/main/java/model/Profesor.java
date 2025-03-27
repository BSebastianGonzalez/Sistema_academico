package model;

import java.util.Objects;

public class Profesor {
    private String departamento;
    private String especialidad;
    private byte añosExperiencia;
    private String gradoAcademico;
    private Usuario usuario;
    private Curso curso;
    private Evaluacion evaluacionCreada;

    public Profesor() {
    }

    public Profesor(String departamento, String especialidad, byte añosExperiencia, String gradoAcademico, Usuario usuario, Curso curso, Evaluacion evaluacionCreada) {
        this.departamento = departamento;
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
        this.gradoAcademico = gradoAcademico;
        this.usuario = usuario;
        this.curso = curso;
        this.evaluacionCreada = evaluacionCreada;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public byte getAñosExperiencia() {
        return añosExperiencia;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Curso getCurso() {
        return curso;
    }

    public Evaluacion getEvaluacionCreada() {
        return evaluacionCreada;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setAñosExperiencia(byte añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setEvaluacionCreada(Evaluacion evaluacionCreada) {
        this.evaluacionCreada = evaluacionCreada;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return añosExperiencia == profesor.añosExperiencia && Objects.equals(departamento, profesor.departamento) && Objects.equals(especialidad, profesor.especialidad) && Objects.equals(gradoAcademico, profesor.gradoAcademico) && Objects.equals(usuario, profesor.usuario) && Objects.equals(curso, profesor.curso) && Objects.equals(evaluacionCreada, profesor.evaluacionCreada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departamento, especialidad, añosExperiencia, gradoAcademico, usuario, curso, evaluacionCreada);
    }

    @Override
    public String toString() {
        return "model.Profesor{" +
                "departamento='" + departamento + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", añosExperiencia=" + añosExperiencia +
                ", gradoAcademico='" + gradoAcademico + '\'' +
                ", usuario=" + usuario +
                ", curso=" + curso +
                ", evaluacionCreada=" + evaluacionCreada +
                '}';
    }
}
