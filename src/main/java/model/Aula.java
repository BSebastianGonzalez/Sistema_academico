package model;

import java.util.Objects;

public class Aula {
    private String codigo;
    private String edificio;
    private short capacidad;
    private String tipo;
    private boolean disponible;
    private SesionClase sesion;

    public Aula() {
    }

    public Aula(String codigo, String edificio, short capacidad, String tipo, boolean disponible, SesionClase sesion) {
        this.codigo = codigo;
        this.edificio = edificio;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.disponible = disponible;
        this.sesion = sesion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getEdificio() {
        return edificio;
    }

    public short getCapacidad() {
        return capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public SesionClase getSesion() {
        return sesion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public void setCapacidad(short capacidad) {
        this.capacidad = capacidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setSesion(SesionClase sesion) {
        this.sesion = sesion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aula aula = (Aula) o;
        return capacidad == aula.capacidad && disponible == aula.disponible && Objects.equals(codigo, aula.codigo) && Objects.equals(edificio, aula.edificio) && Objects.equals(tipo, aula.tipo) && Objects.equals(sesion, aula.sesion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, edificio, capacidad, tipo, disponible, sesion);
    }

    @Override
    public String toString() {
        return "model.Aula{" +
                "codigo='" + codigo + '\'' +
                ", edificio='" + edificio + '\'' +
                ", capacidad=" + capacidad +
                ", tipo='" + tipo + '\'' +
                ", disponible=" + disponible +
                ", sesion=" + sesion +
                '}';
    }
}
