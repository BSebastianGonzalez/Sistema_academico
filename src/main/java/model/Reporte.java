package model;

import java.util.Date;
import java.util.Objects;

public class Reporte {
    private String titulo;
    private String descripcion;
    private Date fechaGeneracion;
    private String tipo;
    private Administrador generadoPor;
    private String formato;
    private String contenido;

    public Reporte() {
    }

    public Reporte(String titulo, String descripcion, Date fechaGeneracion, String tipo, Administrador generadoPor, String formato, String contenido) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaGeneracion = fechaGeneracion;
        this.tipo = tipo;
        this.generadoPor = generadoPor;
        this.formato = formato;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public String getTipo() {
        return tipo;
    }

    public Administrador getGeneradoPor() {
        return generadoPor;
    }

    public String getFormato() {
        return formato;
    }

    public String getContenido() {
        return contenido;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setGeneradoPor(Administrador generadoPor) {
        this.generadoPor = generadoPor;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reporte reporte = (Reporte) o;
        return Objects.equals(titulo, reporte.titulo) && Objects.equals(descripcion, reporte.descripcion) && Objects.equals(fechaGeneracion, reporte.fechaGeneracion) && Objects.equals(tipo, reporte.tipo) && Objects.equals(generadoPor, reporte.generadoPor) && Objects.equals(formato, reporte.formato) && Objects.equals(contenido, reporte.contenido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descripcion, fechaGeneracion, tipo, generadoPor, formato, contenido);
    }

    @Override
    public String toString() {
        return "model.Reporte{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaGeneracion=" + fechaGeneracion +
                ", tipo='" + tipo + '\'' +
                ", generadoPor=" + generadoPor +
                ", formato='" + formato + '\'' +
                ", contenido='" + contenido + '\'' +
                '}';
    }
}
