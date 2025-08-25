package pe.edu.upeu.encapsulamiento;

public class ClaseGeneral {

public static void probarJugador(){
    Jugador jugador = new Jugador();
    jugador.setNombre("Jugador");
    jugador.setApellido("dos santos aveiro");
    jugador.setEdad(48);
    jugador.setPosicion("delantero");
    jugador.setNumeroCam(7);
    System.out.println(jugador);


}


    public static void probar(){
        Estudiante estudiante = new Estudiante();
        estudiante.setCarrera("ing sistemas");
        estudiante.setCodigo("13412341234");
        estudiante.trabajo();

    }


    public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setNombre("willyvodka");
    persona.setEdad(17);
    persona.setGenero('M');
    persona.saludo();
        System.out.println("genero"+persona.getGenero());

    probar();
    probarJugador();
    }
}

