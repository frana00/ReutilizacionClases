package telescopio_clase;

/**
 * Esta es la clase Adaptador, donde se implementa el patrón Adapter mediante herencia
 * Extiende LocalizadorActual (sistema antiguo) e implementa LocalizadorMesonesio (interfaz moderna)
 */
public class AdaptadorActualesAMesonesias extends LocalizadorActual implements LocalizadorMesonesio {

    /**
     * Implementación del método moderno ubicarGranulos
     * Se puede usar el método ajustarAlfas() directamente al LocalizadorActual porque heredamos sus métodos
     */
    public void ubicarGranulos() {
        System.out.println("Localizador Mesonesio: inicio de ubicación de granulos ==========>");
        // Llamada directa al método heredado
        ajustarAlfas();
        System.out.println("Localizador Mesonesio: Ajuste de los parámetros alfas ajustados para completar los gránulos");
        System.out.println("<========== Localizador Mesonesio: fin de ubicación de granulos");
    }

    /**
     * Implementación del método moderno ubicarPlanares
     * Combina dos métodos (ajustarGammas y ajustarAlfas) que han sido heredados
     */
    @Override
    public void ubicarPlanares() {
        System.out.println("Localizador Mesonesio: inicio de ubicación de planares ==========>");
        // Llamadas directas a los métodos heredados
        ajustarGammas();
        System.out.println("Localizador Mesonesio: Ajuste de los parámetros gammas ajustados para completar las planares con alfas");
        ajustarAlfas();
        System.out.println("<========== Localizador Mesonesio: fin de ubicación de planares");
    }

    /**
     * Implementación del método moderno ubicarSemicuantos
     * Solo usa el método heredado ajustarGammas()
     */
    @Override
    public void ubicarSemicuantos() {
        System.out.println("Localizador Mesonesio: inicio de ubicación de semicuantos ==========>");
        // Llamada directa al método heredado
        ajustarGammas();
        System.out.println("Localizador Mesonesio: Ajuste de los parámetros gammas ajustados para completar los semicuantos");
        System.out.println("<========== Localizador Mesonesio: Fin de ubicando de semicuantos");
    }
}