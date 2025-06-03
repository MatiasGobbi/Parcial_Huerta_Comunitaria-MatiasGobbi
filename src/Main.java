import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Sector frutales = new Sector("Frutales", "Sector de cultivos frutales");
        Sector aromaticas = new Sector("Aromáticas", "Sector de plantas aromáticas");

        Cultivo manzana = new Cultivo("Manzana", TipoCultivo.FRUTAL, new Date());
        manzana.setCosechas(new ArrayList<>());
        manzana.getCosechas().add(new Cosecha(LocalDate.of(2025, 3, 1), 120.0));
        manzana.getCosechas().add(new Cosecha(LocalDate.of(2025, 4, 1), 150.0));
        frutales.getCultivos().add(manzana);

        Cultivo menta = new Cultivo("Menta", TipoCultivo.AROMATICA, new Date());
        aromaticas.getCultivos().add(menta);

        Turno turnoVol = new Turno(new Date(), "08:00-12:00");
        Domicilio domVol = new Domicilio("Calle Real", "123", "Mendoza", "Mendoza");
        Voluntario voluntario = new Voluntario("Juan Pérez", "12345678", "juan@mail.com",domVol,turnoVol);
        Tarea tarea1 = new Tarea("Plantación de manzanas", new Date(), frutales);
        Tarea tarea2 = new Tarea("Riego de menta", new Date(), aromaticas);
        voluntario.realizarTarea(tarea1);
        voluntario.realizarTarea(tarea2);
        voluntario.setTurno(turnoVol);


        Domicilio domCap = new Domicilio("Avenida Central", "742", "Mendoza", "Mendoza");
        Capacitador capacitador = new Capacitador("María López", "87654321", "maria@mail.com", domCap, "Agricultura Orgánica");
        Capacitacion capacitacion = new Capacitacion("Manejo Sostenible de Cultivos", new Date(), capacitador);

        Domicilio domVol2 = new Domicilio("Calle Secundaria", "456", "Mendoza", "Mendoza");
        Voluntario asistente1 = new Voluntario("Ana Gómez", "11223344", "ana@mail.com", domVol2,turnoVol);
        Domicilio domVol3 = new Domicilio("Calle Tercer", "789", "Mendoza", "Mendoza");
        Voluntario asistente2 = new Voluntario("Luis Díaz", "55667788", "luis@mail.com", domVol3,turnoVol);

        capacitacion.getVoluntarios().add(asistente1);
        capacitacion.getVoluntarios().add(asistente2);

        Domicilio domDon = new Domicilio("Calle Benefactor", "101", "Mendoza", "Mendoza");
        Donante donante = new Donante("Carlos Ruiz", "99887766", "carlos@mail.com", domDon);
        Donacion donacion = new Donacion(TipoDonacion.DINERO, "Fondo para semillas", LocalDate.now());
        donante.getDonaciones().add(donacion);

        System.out.println("Sector Frutales, cultivo: " + frutales.getCultivos().get(0).getEspecie());
        System.out.println("Voluntario " + voluntario.getNombre() + " ha realizado "
                + voluntario.getTareasRealizadas().size() + " tareas.");
        System.out.println("Capacitación '" + capacitacion.getTema() + "' tiene "
                + capacitacion.getVoluntarios().size() + " asistentes.");
        System.out.println("Donante " + donante.getNombre() + " hizo "
                + donante.getDonaciones().size() + " donación(es).");
    }
}







