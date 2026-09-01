package edu.eci.dosw.barbershop.model;

import java.util.List;

public class Barbero {

    private String nombre;
    private List<Especialidad> especialidades;
    private List<String> dias;
    private int horaInicio;
    private int horaFin;

    public Barbero(String nombre, List<Especialidad> especialidades, List<String> dias,
                   int horaInicio, int horaFin) {
        this.nombre = nombre;
        this.especialidades = especialidades;
        this.dias = dias;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean atiende(List<Especialidad> requeridas, Franja franja) {
        for (Especialidad especialidad : requeridas) {
            if (!especialidades.contains(especialidad)) {
                return false;
            }
        }
        if (!dias.contains(franja.getDia())) {
            return false;
        }
        return franja.getHora() >= horaInicio && franja.getHora() < horaFin;
    }
}
