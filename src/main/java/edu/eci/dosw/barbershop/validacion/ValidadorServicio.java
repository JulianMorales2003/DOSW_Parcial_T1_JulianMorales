package edu.eci.dosw.barbershop.validacion;

import edu.eci.dosw.barbershop.model.CatalogoServicios;
import edu.eci.dosw.barbershop.model.SolicitudTurno;

public class ValidadorServicio extends Validador {

    private CatalogoServicios catalogo;

    public ValidadorServicio(CatalogoServicios catalogo) {
        this.catalogo = catalogo;
    }

    protected Resultado evaluar(SolicitudTurno solicitud) {
        for (String codigo : solicitud.getCodigosServicio()) {
            if (!catalogo.estaActivo(codigo)) {
                return new Resultado(false, "El servicio " + codigo + " no esta en el catalogo");
            }
        }
        return new Resultado(true, "Servicio en catalogo");
    }
}
