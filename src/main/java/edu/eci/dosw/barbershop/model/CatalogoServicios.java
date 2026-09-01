package edu.eci.dosw.barbershop.model;

import java.util.ArrayList;
import java.util.List;

public class CatalogoServicios {

    private List<Servicio> servicios;

    public CatalogoServicios() {
        servicios = new ArrayList<>();
        servicios.add(new Servicio("SER-001", "Corte clasico", 25000, Especialidad.CORTE));
        servicios.add(new Servicio("SER-002", "Corte + barba", 38000, Especialidad.CORTE_BARBA));
        servicios.add(new Servicio("SER-003", "Diseno de cejas", 15000, Especialidad.CEJAS));
        servicios.add(new Servicio("SER-004", "Afeitado con navaja", 20000, Especialidad.BARBA));
        servicios.add(new Servicio("SER-005", "Tratamiento capilar", 45000, Especialidad.CAPILAR));
    }

    public Servicio buscar(String codigo) {
        for (Servicio servicio : servicios) {
            if (servicio.getCodigo().equals(codigo)) {
                return servicio;
            }
        }
        return null;
    }

    public boolean estaActivo(String codigo) {
        return buscar(codigo) != null;
    }

    public List<Especialidad> especialidadesDe(List<String> codigos) {
        List<Especialidad> resultado = new ArrayList<>();
        for (String codigo : codigos) {
            Servicio servicio = buscar(codigo);
            if (servicio != null && !resultado.contains(servicio.getEspecialidad())) {
                resultado.add(servicio.getEspecialidad());
            }
        }
        return resultado;
    }

    public double calcularTotal(List<String> codigos) {
        double total = 0;
        for (String codigo : codigos) {
            Servicio servicio = buscar(codigo);
            if (servicio != null) {
                total = total + servicio.getPrecio();
            }
        }
        return total;
    }
}
