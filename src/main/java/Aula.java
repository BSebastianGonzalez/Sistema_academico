import java.util.List;
import java.util.Objects;

public class Aula {
    private String codigo;
    private String edificio;
    private short capacidad;
    private String tipo;
    private boolean disponible;
    private List<SesionClase> sesiones;

    public Aula() {
    }

    public Aula(String codigo, String edificio, short capacidad, String tipo, boolean disponible, List<SesionClase> sesiones) {
        this.codigo = codigo;
        this.edificio = edificio;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.disponible = disponible;
        this.sesiones = sesiones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public short getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(short capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public List<SesionClase> getSesiones() {
        return sesiones;
    }

    public void setSesiones(List<SesionClase> sesiones) {
        this.sesiones = sesiones;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aula aula = (Aula) o;
        return capacidad == aula.capacidad && disponible == aula.disponible && Objects.equals(codigo, aula.codigo) && Objects.equals(edificio, aula.edificio) && Objects.equals(tipo, aula.tipo) && Objects.equals(sesiones, aula.sesiones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, edificio, capacidad, tipo, disponible, sesiones);
    }

    @Override
    public String toString() {
        return "Aula{" +
                "codigo='" + codigo + '\'' +
                ", edificio='" + edificio + '\'' +
                ", capacidad=" + capacidad +
                ", tipo='" + tipo + '\'' +
                ", disponible=" + disponible +
                ", sesiones=" + sesiones +
                '}';
    }
}
