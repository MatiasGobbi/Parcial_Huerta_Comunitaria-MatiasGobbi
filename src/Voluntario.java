import java.util.ArrayList;
import java.util.List;

public class Voluntario extends Persona{
    private List<Tarea> tareasRealizadas = new ArrayList<>();
    private Turno turno;

    public Voluntario(String nombre, String dni, String email, Domicilio domicilio, Turno turno) {
        super(nombre, dni, email, domicilio);
        this.turno = turno;
    }


    public List<Tarea> getTareasRealizadas() {
        return tareasRealizadas;
    }

    public void setTareasRealizadas(List<Tarea> tareasRealizadas) {
        this.tareasRealizadas = tareasRealizadas;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public void realizarTarea(Tarea tarea){
        tareasRealizadas.add(tarea);
    }

    @Override
    public String toString() {
        return "Voluntario{" +
                "tareasRealizadas=" + tareasRealizadas +
                ", turno=" + turno +
                '}';
    }
}
