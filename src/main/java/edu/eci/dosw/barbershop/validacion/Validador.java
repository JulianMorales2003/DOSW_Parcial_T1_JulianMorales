package edu.eci.dosw.barbershop.validacion;

import edu.eci.dosw.barbershop.model.SolicitudTurno;
import java.util.ArrayList;
import java.util.List;

public abstract class Validador {

    private Validador siguiente;
    private List<Resultado> trazas = new ArrayList<>();

    public void setSiguiente(Validador siguiente) {
        this.siguiente = siguiente;
    }

    public boolean validar(SolicitudTurno solicitud) {
        trazas = new ArrayList<>();
        Resultado resultado = evaluar(solicitud);
        trazas.add(resultado);

        if (!resultado.isAprobado()) {
            return false;
        }
        if (siguiente == null) {
            return true;
        }

        boolean aprobado = siguiente.validar(solicitud);
        trazas.addAll(siguiente.getTrazas());
        return aprobado;
    }

    public List<Resultado> getTrazas() {
        return trazas;
    }

    protected abstract Resultado evaluar(SolicitudTurno solicitud);
}
