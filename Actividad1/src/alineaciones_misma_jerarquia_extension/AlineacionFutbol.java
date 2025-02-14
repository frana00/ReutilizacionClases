package alineaciones_misma_jerarquia_extension;

// Clase concreta para crear equipos de fútbol
public class AlineacionFutbol implements Alineacion {
    // Equipo de fútbol que se va a construir
    private EquipoFutbol equipo;

    // Constructor: inicializa un nuevo equipo de fútbol
    public AlineacionFutbol() {
        this.equipo = new EquipoFutbol();
    }

    // Configura la línea de defensas (primera línea)
    public void primeraLinea() {
        System.out.println("Línea de defensas");
        // Crea array con 4 defensas (el quinto elemento es null)
        String[] defensas = {"Jugador 1", "Jugador 2", "Jugador 3", "Jugador 4", null};
        equipo.setDefensas(defensas);
    }

    // Configura la línea de centrocampistas (segunda línea)
    @Override
    public void segundaLinea() {
        System.out.println("Línea de centros");
        // Crea array con 3 centrocampistas (los últimos dos elementos son null)
        String[] centrocampistas = {"Jugador 5", "Jugador 6", "Jugador 7", null, null};
        equipo.setCentrocampistas(centrocampistas);
    }

    // Configura la línea de delanteros (tercera línea)
    public void terceraLinea() {
        System.out.println("Líneas de delanteros");
        // Crea array con 3 delanteros (los últimos dos elementos son null)
        String[] delanteros = {"Jugador 8", "Jugador 9", "Jugador 10", null, null};
        equipo.setDelanteros(delanteros);
    }

    // Configura los suplentes del equipo
    public void suplentes() {
        System.out.println("Suplentes futbol: portero2, jugadores 11-20");
        // Crea array con 11 suplentes (un portero y 10 jugadores)
        String[] suplentes = {"portero2", "jugador11", "jugador12", "jugador13", "jugador14",
                "jugador15", "jugador16", "jugador17", "jugador18", "jugador19", "jugador20"};
        equipo.setSuplentes(suplentes);
    }

    // Configura el portero titular
    public void portero() {
        System.out.println("Portero");
        equipo.setPortero("Portero 1");
    }

    // Devuelve el equipo generado
    public Equipo generarEquipo() {
        System.out.println("Se ha generado ya el equipo de fútbol");
        return equipo;
    }
}