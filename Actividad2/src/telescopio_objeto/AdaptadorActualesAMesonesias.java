package telescopio_objeto;

/**
 * Esta clase implementa la interfaz moderna (LocalizadorMesonesio)
 * Usa la clase antigua (LocalizadorActual) mediante composición
 */
public class AdaptadorActualesAMesonesias implements LocalizadorMesonesio {
    // Referencia al objeto que queremos adaptar
    private LocalizadorActual localizadorActual;

    /**
     * Constructor. Se inicializa el adaptador creando una nueva instancia
     * del sistema antiguo que va a ser adaptado
     */
    public AdaptadorActualesAMesonesias() {
        this.localizadorActual = new LocalizadorActual();
    }

    /**
     * Implementación del método moderno ubicarGranulos
     * "Traduce" la llamada moderna a una serie de operaciones pertenecientes al sistema antiguo
     */
    public void ubicarGranulos() {
        System.out.println("Localizador Mesonesio: inicio de ubicación de granulos ==========>");
        // Usa el método antiguo para lograr la funcionalidad moderna
        localizadorActual.ajustarAlfas();
        System.out.println("Localizador Mesonesio: Ajuste de los parámetros alfas ajustados para completar los gránulos");
        System.out.println("<========== Localizador Mesonesio: fin de ubicación de granulos");
    }

    /**
     * Implementación del método moderno ubicarPlanares
     * Este método necesita combinar operaciones antiguas: ajustar gammas y alfas
     */
    public void ubicarPlanares() {
        System.out.println("Localizador Mesonesio: inicio de ubicación de planares ==========>");
        // Usa una secuencia de métodos antiguos para lograr la funcionalidad moderna
        localizadorActual.ajustarGammas();
        System.out.println("Localizador Mesonesio: Ajuste de los parámetros gammas ajustados para completar las planares con alfas");
        localizadorActual.ajustarAlfas();
        System.out.println("<========== Localizador Mesonesio: fin de ubicación de planares");
    }

    /**
     * Implementación del método moderno ubicarSemicuantos
     * Traduce la llamada moderna usando solo ajustarGammas del sistema antiguo
     */
    public void ubicarSemicuantos() {
        System.out.println("Localizador Mesonesio: inicio de ubicación de semicuantos ==========>");
        // Usa el método antiguo para lograr la funcionalidad moderna
        localizadorActual.ajustarGammas();
        System.out.println("Localizador Mesonesio: Ajuste de los parámetros gammas ajustados para completar los semicuantos");
        System.out.println("<========== Localizador Mesonesio: Fin de ubicando de semicuantos");
    }
}