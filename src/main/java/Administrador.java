import java.util.Objects;

public class Administrador {
    private String departamento;
    private byte nivelAcceso;
    private Usuario usuario;

    public Administrador() {
    }

    public Administrador(String departamento, byte nivelAcceso, Usuario usuario) {
        this.departamento = departamento;
        this.nivelAcceso = nivelAcceso;
        this.usuario = usuario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public byte getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(byte nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Administrador that = (Administrador) o;
        return nivelAcceso == that.nivelAcceso && Objects.equals(departamento, that.departamento) && Objects.equals(usuario, that.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departamento, nivelAcceso, usuario);
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "departamento='" + departamento + '\'' +
                ", nivelAcceso=" + nivelAcceso +
                ", usuario=" + usuario +
                '}';
    }
}
