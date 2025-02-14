package telescopio_objeto;

/**
 * Clase que representa el sistema antiguo del telescopio
 * Esta clase es igual a la versión del paquete telescopio_clase, pero está en un
 * paquete diferente porque se trata de otra implementación
 */
public class LocalizadorActual {

    /**
     * Constructor.
     * Imprime un mensaje que indica que se ha creado una instancia del sistema de localización antiguo
     */
    public LocalizadorActual() {
        System.out.println("Localizador actual ");
    }

    // Método que realiza ajustes alfa en el telescopio antiguo
    public void ajustarAlfas() {
        System.out.println("Localizador Actual: Ajuste de los parámetros alfa");
    }

    // Método que realiza ajustes gamma en el telescopio antiguo
    public void ajustarGammas() {
        System.out.println("Localizador Actual: Ajuste de los parametros gamma");
    }
}