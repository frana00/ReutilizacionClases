package alineaciones_misma_jerarquia;

/**
 * Clase abstracta Equipo - Producto base en el patrón Builder
 * Define la estructura básica de cualquier equipo
 */

// Equipo es el producto base en el patrón Builder
public class Equipo {
    public int num_titulares;    // Número de jugadores titulares
    public int num_suplentes;    // Número de jugadores suplentes

    // Método toString para mostrar información del equipo
    public String toString() {
        return "Equipo con " + num_titulares + " titulares y " + num_suplentes + " suplentes";
    }
}