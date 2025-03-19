import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Evaluacion {
    private String titulo;
    private String descripcion;
    private Date fechaAplicacion;
    private float porcentaje;
    private String tipo;
    private Profesor creador;
    private Curso curso;
    private List<Calificacion> calificaciones;

    public Evaluacion() {
    }

    public Evaluacion(String titulo, String descripcion, Date fechaAplicacion, float porcentaje, String tipo, Profesor creador, Curso curso, List<Calificacion> calificaciones) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaAplicacion = fechaAplicacion;
        this.porcentaje = porcentaje;
        this.tipo = tipo;
        this.creador = creador;
        this.curso = curso;
        this.calificaciones = calificaciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(Date fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Profesor getCreador() {
        return creador;
    }

    public void setCreador(Profesor creador) {
        this.creador = creador;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Evaluacion that = (Evaluacion) o;
        return Float.compare(porcentaje, that.porcentaje) == 0 && Objects.equals(titulo, that.titulo) && Objects.equals(descripcion, that.descripcion) && Objects.equals(fechaAplicacion, that.fechaAplicacion) && Objects.equals(tipo, that.tipo) && Objects.equals(creador, that.creador) && Objects.equals(curso, that.curso) && Objects.equals(calificaciones, that.calificaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descripcion, fechaAplicacion, porcentaje, tipo, creador, curso, calificaciones);
    }

    @Override
    public String toString() {
        return "Evaluacion{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaAplicacion=" + fechaAplicacion +
                ", porcentaje=" + porcentaje +
                ", tipo='" + tipo + '\'' +
                ", creador=" + creador +
                ", curso=" + curso +
                ", calificaciones=" + calificaciones +
                '}';
    }
}
