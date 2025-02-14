package telescopio_clase;

public class Cliente {
    public static void main(String[] args) {
        // Creamos una variable de tipo LocalizadorMesonesio (la interfaz moderna)
        // Se inicializa con una instancia del Adaptador
        // Funciona como un "traductor" que usa el telescopio antiguo
        LocalizadorMesonesio locM = new AdaptadorActualesAMesonesias();

        // Llamamos a los métodos modernos que necesita el nuevo sistema
        // Internamente, el adaptador traducirá estas llamadas a los métodos antiguos

        // Esto internamente usará ajustarAlfas() del telescopio antiguo
        locM.ubicarGranulos();

        // Esto combinará ajustarGammas() y ajustarAlfas() del telescopio antiguo
        locM.ubicarPlanares();

        // Esto usará ajustarGammas() del telescopio antiguo
        locM.ubicarSemicuantos();
    }
}