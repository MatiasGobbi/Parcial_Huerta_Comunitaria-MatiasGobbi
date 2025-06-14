public class Capacitador extends Persona{
    private String especialidad;

    public Capacitador(String nombre, String dni, String email, Domicilio domicilio, String especialidad) {
        super(nombre, dni, email, domicilio);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Capacitador{" +
                "especialidad='" + especialidad + '\'' +
                '}';
    }
}
