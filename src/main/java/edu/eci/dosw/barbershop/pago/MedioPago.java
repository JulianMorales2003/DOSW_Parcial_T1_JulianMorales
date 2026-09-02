package edu.eci.dosw.barbershop.pago;

public interface MedioPago {

    String getNombre();

    RespuestaPago pagar(DatosPago datos);
}
