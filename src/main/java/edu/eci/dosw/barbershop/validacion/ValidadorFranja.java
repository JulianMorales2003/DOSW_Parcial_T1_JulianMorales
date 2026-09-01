package edu.eci.dosw.barbershop.validacion;

import edu.eci.dosw.barbershop.model.SolicitudTurno;
import edu.eci.dosw.barbershop.servicio.Agenda;

public class ValidadorFranja extends Validador {

    private Agenda agenda;

    public ValidadorFranja(Agenda agenda) {
        this.agenda = agenda;
    }

    protected Resultado evaluar(SolicitudTurno solicitud) {
        if (agenda.hayCupo(solicitud.getFranja())) {
            return new Resultado(true, "Franja disponible");
        }
        return new Resultado(false, "Franja no disponible, ya hay 3 clientes en esa hora");
    }
}
