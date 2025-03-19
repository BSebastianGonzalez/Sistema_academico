import java.util.List;
import java.util.Objects;

public class Profesor {
    private String departamento;
    private String especialidad;
    private byte añosExperiencia;
    private String gradoAcademico;
    private Usuario usuario;
    private List<Curso> cursos;
    private List<Evaluacion> evaluacionesCreadas;

    public Profesor() {
    }

    public Profesor(String departamento, String especialidad, byte añosExperiencia, String gradoAcademico, Usuario usuario, List<Curso> cursos, List<Evaluacion> evaluacionesCreadas) {
        this.departamento = departamento;
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
        this.gradoAcademico = gradoAcademico;
        this.usuario = usuario;
        this.cursos = cursos;
        this.evaluacionesCreadas = evaluacionesCreadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public byte getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(byte añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Evaluacion> getEvaluacionesCreadas() {
        return evaluacionesCreadas;
    }

    public void setEvaluacionesCreadas(List<Evaluacion> evaluacionesCreadas) {
        this.evaluacionesCreadas = evaluacionesCreadas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return añosExperiencia == profesor.añosExperiencia && Objects.equals(departamento, profesor.departamento) && Objects.equals(especialidad, profesor.especialidad) && Objects.equals(gradoAcademico, profesor.gradoAcademico) && Objects.equals(usuario, profesor.usuario) && Objects.equals(cursos, profesor.cursos) && Objects.equals(evaluacionesCreadas, profesor.evaluacionesCreadas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departamento, especialidad, añosExperiencia, gradoAcademico, usuario, cursos, evaluacionesCreadas);
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "departamento='" + departamento + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", añosExperiencia=" + añosExperiencia +
                ", gradoAcademico='" + gradoAcademico + '\'' +
                ", usuario=" + usuario +
                ", cursos=" + cursos +
                ", evaluacionesCreadas=" + evaluacionesCreadas +
                '}';
    }
}
