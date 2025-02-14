package telescopio_objeto;

/**
 * Clase Cliente, para hacer uso del adaptador
 * La adaptación se realiza mediante composición
 */
public class Cliente {
    public static void main(String[] args) {
        // Creamos una referencia de tipo LocalizadorMesonesio (interfaz moderna)
        // pero la inicializamos con nuestro adaptador
        LocalizadorMesonesio locM = new AdaptadorActualesAMesonesias();

        // Llamamos a los métodos modernos
        // El adaptador implementa los métodos internamente
        locM.ubicarGranulos();
        locM.ubicarPlanares();
        locM.ubicarSemicuantos();
    }
}