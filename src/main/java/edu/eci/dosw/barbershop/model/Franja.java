package edu.eci.dosw.barbershop.model;

public class Franja {

    private String dia;
    private int hora;

    public Franja(String dia, int hora) {
        this.dia = dia;
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public int getHora() {
        return hora;
    }

    public String getClave() {
        return dia + "-" + hora;
    }

    public String toString() {
        return dia + " " + hora + ":00";
    }
}
