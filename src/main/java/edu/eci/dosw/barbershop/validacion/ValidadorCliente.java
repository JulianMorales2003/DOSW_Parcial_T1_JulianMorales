package edu.eci.dosw.barbershop.validacion;

import edu.eci.dosw.barbershop.model.Cliente;
import edu.eci.dosw.barbershop.model.SolicitudTurno;

public class ValidadorCliente extends Validador {

    protected Resultado evaluar(SolicitudTurno solicitud) {
        Cliente cliente = solicitud.getCliente();

        if (cliente.getNombre() == null || cliente.getNombre().isEmpty()) {
            return new Resultado(false, "El nombre del cliente es obligatorio");
        }
        if (cliente.getTelefono() == null || !cliente.getTelefono().matches("[0-9]{10}")) {
            return new Resultado(false, "Telefono invalido, debe tener 10 digitos");
        }
        if (cliente.getCorreo() == null || !cliente.getCorreo().endsWith("@gmail.com")) {
            return new Resultado(false, "Correo invalido");
        }
        return new Resultado(true, "Datos del cliente validos");
    }
}
