package edu.eci.dosw.barbershop.validacion;

import edu.eci.dosw.barbershop.model.Barbero;
import edu.eci.dosw.barbershop.model.CatalogoServicios;
import edu.eci.dosw.barbershop.model.Especialidad;
import edu.eci.dosw.barbershop.model.SolicitudTurno;
import edu.eci.dosw.barbershop.servicio.Agenda;
import java.util.List;

public class ValidadorBarbero extends Validador {

    private Agenda agenda;
    private CatalogoServicios catalogo;

    public ValidadorBarbero(Agenda agenda, CatalogoServicios catalogo) {
        this.agenda = agenda;
        this.catalogo = catalogo;
    }

    protected Resultado evaluar(SolicitudTurno solicitud) {
        List<Especialidad> requeridas = catalogo.especialidadesDe(solicitud.getCodigosServicio());
        Barbero barbero = agenda.buscarBarbero(requeridas, solicitud.getFranja(),
                solicitud.getBarberoPreferido());

        if (barbero == null) {
            return new Resultado(false, "No hay barbero disponible con esa especialidad");
        }
        solicitud.setBarberoAsignado(barbero);
        return new Resultado(true, "Barbero asignado: " + barbero.getNombre());
    }
}
