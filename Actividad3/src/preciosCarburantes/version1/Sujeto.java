package preciosCarburantes.version1;

/**
 * Interfaz que define el contrato para el sujeto observable
 * Define los métodos necesarios para gestionar los observadores y sus notificaciones
 */
public interface Sujeto {
    /**
     * Método para registrar (añadir) un nuevo observador
     * Este observador será notificado cuando haya cambios en los datos
     */
    public void registrarObservador(Observador o);

    /**
     * Método para eliminar un observador de la lista de observadores
     * Este observador dejará de recibir notificaciones
     */
    public void borrarObservador(Observador o);

    /**
     * Método para notificar a todos los observadores registrados
     * Se llama cuando hay un cambio en los datos que los observadores
     * necesitan conocer
     */
    public void notificar();
}