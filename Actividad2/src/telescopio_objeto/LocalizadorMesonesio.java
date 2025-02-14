package telescopio_objeto;

/**
 * Interfaz para el sistema moderno de localización de mesonesio
 * Es igual a la versión del paquete telescopio_clase, pero está en un
 * paquete diferente porque corresponde a otra implementación.
 */
public interface LocalizadorMesonesio {

    // Método para ubicar gránulos
    void ubicarGranulos();

    // Método para ubicar planares
    void ubicarPlanares();

    // Método para ubicar semicuantos
    void ubicarSemicuantos();
}