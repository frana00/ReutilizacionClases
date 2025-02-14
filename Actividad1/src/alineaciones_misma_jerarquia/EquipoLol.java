package alineaciones_misma_jerarquia;

/**
 * Clase concreta para equipos de League of Legends
 * Implementa la interfaz Equipo
 * Define los atributos y métodos específicos para un equipo de LoL
 */
 // Clase concreta para equipos de League of Legends
public class EquipoLol extends Equipo {
    // Atributos para almacenar los jugadores de un equipo de LoL
    private String top;
    private String mid;
    private String jungla;
    private String adc;
    private String support;

    // Constructor: inicializa un equipo de LoL con estructura estándar
    public EquipoLol() {
        this.num_titulares = 5;
        this.num_suplentes = 0;
    }

    // Métodos para obtener las diferentes posiciones del equipo

    public void setTop(String top) {
        this.top = top;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public void setJungla(String jungla) {
        this.jungla = jungla;
    }

    public void setAdc(String adc) {
        this.adc = adc;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    // Método toString para mostrar información del equipo
    public String toString() {
        return "Equipo: \n jungla - " + jungla +
                "\n mid - " + mid +
                "\n adc - " + adc +
                "\n support - " + support +
                "\n top -" + top;
    }
}