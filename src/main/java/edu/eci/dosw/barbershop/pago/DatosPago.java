package edu.eci.dosw.barbershop.pago;

public class DatosPago {

    private String medio;
    private String pagador;
    private double monto;
    private String telefono;
    private String banco;
    private String cuenta;
    private String tarjeta;
    private String cvv;

    public DatosPago(String medio, String pagador) {
        this.medio = medio;
        this.pagador = pagador;
    }

    public String getMedio() {
        return medio;
    }

    public String getPagador() {
        return pagador;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
