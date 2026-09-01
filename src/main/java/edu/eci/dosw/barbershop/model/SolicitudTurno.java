package edu.eci.dosw.barbershop.model;

import edu.eci.dosw.barbershop.pago.DatosPago;
import java.util.List;

public class SolicitudTurno {

    private String numero;
    private Cliente cliente;
    private List<String> codigosServicio;
    private Franja franja;
    private String barberoPreferido;
    private DatosPago datosPago;
    private Barbero barberoAsignado;

    public SolicitudTurno(String numero, Cliente cliente, List<String> codigosServicio,
                          Franja franja, String barberoPreferido, DatosPago datosPago) {
        this.numero = numero;
        this.cliente = cliente;
        this.codigosServicio = codigosServicio;
        this.franja = franja;
        this.barberoPreferido = barberoPreferido;
        this.datosPago = datosPago;
    }

    public String getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<String> getCodigosServicio() {
        return codigosServicio;
    }

    public Franja getFranja() {
        return franja;
    }

    public String getBarberoPreferido() {
        return barberoPreferido;
    }

    public DatosPago getDatosPago() {
        return datosPago;
    }

    public Barbero getBarberoAsignado() {
        return barberoAsignado;
    }

    public void setBarberoAsignado(Barbero barbero) {
        this.barberoAsignado = barbero;
    }
}
