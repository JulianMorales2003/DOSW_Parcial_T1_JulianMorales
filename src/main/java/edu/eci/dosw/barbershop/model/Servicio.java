package edu.eci.dosw.barbershop.model;

public class Servicio {

    private String codigo;
    private String nombre;
    private double precio;
    private Especialidad especialidad;

    public Servicio(String codigo, String nombre, double precio, Especialidad especialidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.especialidad = especialidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }
}
