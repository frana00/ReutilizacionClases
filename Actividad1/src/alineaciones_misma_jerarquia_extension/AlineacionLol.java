package alineaciones_misma_jerarquia_extension;

// Clase concreta para crear equipos de League of Legends
public class AlineacionLol implements Alineacion {
    // Equipo de LoL
    private EquipoLol equipo;

    // Constructor: inicializa un nuevo equipo de LoL
    public AlineacionLol() {
        this.equipo = new EquipoLol();
    }

    // Configura el jugador de línea superior (Top)
    public void primeraLinea() {
        System.out.println("Top: jugador 1");
        equipo.setTop("Jugador 1");
    }

    // Configura el jugador de línea media (Mid) y el Jungla
    public void segundaLinea() {
        System.out.println("Mid: jugador 2");
        equipo.setMid("Jugador 2");
        equipo.setJungla("Jugador 5");
    }

    // Configura los jugadores de línea inferior (ADC y Support)
    public void terceraLinea() {
        System.out.println("Bot1: jugador 3. Bot2: jugador 4");
        equipo.setAdc("Jugador 3");
        equipo.setSupport("Jugador 4");
    }

    // LoL no tiene suplentes
    public void suplentes() {
        System.out.println("Lol no tiene suplementes");
    }

    // LoL no tiene portero
    public void portero() {
        System.out.println("Lol no tiene portero");
    }

    // Devuelve el equipo generado
    public Equipo generarEquipo() {
        System.out.println("Se ha generado ya el equiop de Lol");
        return equipo;
    }
}