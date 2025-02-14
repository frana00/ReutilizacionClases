package telescopio_clase;

/**
 * Interfaz para el nuevo sistema de localización de mesonesio
 * Es la interfaz moderna con la que vamos a trabajar
 */
public interface LocalizadorMesonesio {

    // Método para ubicar gránulos
    void ubicarGranulos();

    // Método para ubicar planares
    void ubicarPlanares();

    // Método para ubicar semicuantos
    void ubicarSemicuantos();
}