package preciosCarburantes.version1;

/**
 * Interfaz que define el contrato para todos los observadores
 */
public interface Observador {
    /**
     * Método que será llamado por el sujeto observable cuando haya cambios
     * Cada clase que implemente esta interfaz definirá su propia forma
     * de reaccionar ante las actualizaciones
     */
    public void actualizar();
}