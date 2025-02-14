package alineaciones_misma_jerarquia;

/**
 * Clase Entrenador - Actúa como Director en el patrón Builder
 * Coordina la construcción de diferentes tipos de equipos
 */

// Entrenador es el director del patrón Builder
public class Entrenador {
    // Atributo que almacena la alineación específica a utilizar
    private Alineacion alineacion;

    // Constructor: inicializa el entrenador con una alineación específica
    public Entrenador(Alineacion alineacion) {
        this.alineacion = alineacion;
    }

    // Método para decidir la alineación del equipo
    public Equipo decideAlineacion() {
        // Ejecuta los pasos en orden específico
        alineacion.primeraLinea();
        alineacion.segundaLinea();
        alineacion.terceraLinea();
        alineacion.suplentes();
        alineacion.portero();
        return alineacion.generarEquipo();
    }
}