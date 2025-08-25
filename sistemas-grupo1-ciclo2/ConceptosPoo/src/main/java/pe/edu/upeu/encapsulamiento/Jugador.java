package pe.edu.upeu.encapsulamiento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jugador {
    private String nombre;
    private String apellido;
    private int edad;
    private String posicion;
    private int numeroCam;

    @Override
    public String toString() {
        return "El jugador tiene estas caracteristicas:\n"+
                "Nombre:"+nombre+
                "\nApellido:"+apellido
                + "\nEdad:"+edad
                + "\nPosicion:"+posicion
                + "\nCamiseta N°:"+numeroCam;
    }
}

