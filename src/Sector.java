import java.util.ArrayList;
import java.util.List;

public class Sector {
    private String nombre;
    private String descripcion;
    private List<Cultivo> cultivos = new ArrayList<>();

    public Sector(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Cultivo> getCultivos() {
        return cultivos;
    }

    public void setCultivos(List<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }



    @Override
    public String toString() {
        return "Sector{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cultivos=" + cultivos +
                '}';
    }
}
