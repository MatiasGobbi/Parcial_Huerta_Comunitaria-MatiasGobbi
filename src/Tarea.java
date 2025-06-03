import java.util.Date;

public class Tarea {
    private String descripcion;
    private Date fecha;
    private Sector sector;

    public Tarea(String descripcion, Date fecha, Sector sector) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.sector = sector;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", sector=" + sector +
                '}';
    }
}
