package edu.eci.dosw.barbershop.validacion;

public class Resultado {

    private boolean aprobado;
    private String mensaje;

    public Resultado(boolean aprobado, String mensaje) {
        this.aprobado = aprobado;
        this.mensaje = mensaje;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String toString() {
        if (aprobado) {
            return "[OK] " + mensaje;
        }
        return "[RECHAZADO] " + mensaje;
    }
}
