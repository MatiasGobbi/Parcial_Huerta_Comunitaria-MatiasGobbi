import java.util.ArrayList;
import java.util.List;

public class Donante extends Persona{
    private List<Donacion> donaciones = new ArrayList<>();

    public Donante(String nombre, String dni, String email, Domicilio domicilio) {
        super(nombre, dni, email, domicilio);
    }

    public List<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(List<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public void mostrarDonaciones() {
        for (Donacion d : donaciones) {
            System.out.println(d.getTipoDonacion() + " " + d.getDescripcion() + " " + d.getFecha());
        }
    }

    @Override
    public String toString() {
        return "Donante{" +
                "donaciones=" + donaciones +
                '}';
    }
}
