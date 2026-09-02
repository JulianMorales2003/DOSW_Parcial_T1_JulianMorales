package edu.eci.dosw.barbershop.servicio;

import edu.eci.dosw.barbershop.model.Barbero;
import edu.eci.dosw.barbershop.model.Especialidad;
import edu.eci.dosw.barbershop.model.Franja;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Agenda {

    private List<Barbero> barberos = new ArrayList<>();
    private Map<String, List<String>> ocupacion = new HashMap<>();

    public void agregarBarbero(Barbero barbero) {
        barberos.add(barbero);
    }

    public List<String> getOcupados(Franja franja) {
        if (!ocupacion.containsKey(franja.getClave())) {
            ocupacion.put(franja.getClave(), new ArrayList<>());
        }
        return ocupacion.get(franja.getClave());
    }

    public boolean hayCupo(Franja franja) {
        return getOcupados(franja).size() < 3;
    }

    public Barbero buscarBarbero(List<Especialidad> requeridas, Franja franja, String preferido) {
        List<String> ocupados = getOcupados(franja);
        for (Barbero barbero : barberos) {
            if (ocupados.contains(barbero.getNombre())) {
                continue;
            }
            if (preferido != null && !barbero.getNombre().equals(preferido)) {
                continue;
            }
            if (barbero.atiende(requeridas, franja)) {
                return barbero;
            }
        }
        return null;
    }

    public void confirmar(Franja franja, Barbero barbero) {
        getOcupados(franja).add(barbero.getNombre());
    }
}
