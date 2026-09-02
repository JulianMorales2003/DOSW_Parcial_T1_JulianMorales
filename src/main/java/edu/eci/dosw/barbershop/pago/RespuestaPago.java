package edu.eci.dosw.barbershop.pago;

public class RespuestaPago {

    private String paymentId;
    private String estado;
    private String mensaje;

    public RespuestaPago(String paymentId, String estado, String mensaje) {
        this.paymentId = paymentId;
        this.estado = estado;
        this.mensaje = mensaje;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getEstado() {
        return estado;
    }

    public String getMensaje() {
        return mensaje;
    }
}
