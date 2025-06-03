import java.util.ArrayList;
import java.util.List;

public class Donante extends Persona{
    private List<Donacion> donaciones = new ArrayList<>();

    public Donante(String nombre, String dni, String email, Domicilio domicilio, List<Donacion> donaciones) {
        super(nombre, dni, email, domicilio);
        this.donaciones = donaciones;
    }

    public List<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(List<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    @Override
    public String toString() {
        return "Donante{" +
                "donaciones=" + donaciones +
                '}';
    }
}
