package preciosCarburantes.version1;

/**
 * Clase que implementa un observador que muestra estadísticas de cambios en los precios
 * Mantiene un registro de los últimos precios para poder calcular las variaciones
 */
public class Estadisticas implements Observador {
    // Referencia al sujeto observable (fuente de datos de precios)
    private PreciosCarburantes precios;

    // Variables para almacenar los últimos precios conocidos de cada combustible
    private double lastG95E5;    // Último precio de Gasolina 95 E5
    private double lastG95E10;   // Último precio de Gasolina 95 E10
    private double lastGA;       // Último precio de Gasóleo A
    private double lastGB;       // Último precio de Gasóleo B
    private double lastGM;       // Último precio de Gasóleo Marítimo

    /**
     * Constructor de la clase Estadisticas
     */
    public Estadisticas(PreciosCarburantes precios) {
        this.precios = precios;
        // Registra esta instancia como observador del sujeto
        precios.registrarObservador(this);
        // Inicializa todos los precios anteriores a 0.0
        lastG95E5 = lastG95E10 = lastGA = lastGB = lastGM = 0.0;
    }

    /**
     * Método que se ejecuta cada vez que hay un cambio en los precios
     * Muestra la variación de precios desde la última actualización
     */
    public void actualizar() {
        // Para cada tipo de combustible:
        // 1. Muestra el precio anterior
        // 2. Muestra el precio actual
        // 3. Calcula y muestra la diferencia (incremento o decremento)
        System.out.println("Gasolina 95 E5 pasa de " + lastG95E5 + " a " + precios.getGasolina95E5() +
                " incremento de " + (precios.getGasolina95E5() - lastG95E5));
        System.out.println("Gasolina 95 E10 pasa de " + lastG95E10 + " a " + precios.getGasolina95E10() +
                " incremento de " + (precios.getGasolina95E10() - lastG95E10));
        System.out.println("Gasóleo A pasa de " + lastGA + " a " + precios.getGasoleoA() +
                " incremento de " + (precios.getGasoleoA() - lastGA));
        System.out.println("Gasóleo B pasa de " + lastGB + " a " + precios.getGasoleoB() +
                " incremento de " + (precios.getGasoleoB() - lastGB));
        System.out.println("Gasóleo marítimo pasa de " + lastGM + " a " + precios.getGasoleoMaritimo() +
                " incremento de " + (precios.getGasoleoMaritimo() - lastGM));

        // Actualiza las variables de último precio conocido con los valores actuales
        // para la próxima comparación
        lastG95E5 = precios.getGasolina95E5();
        lastG95E10 = precios.getGasolina95E10();
        lastGA = precios.getGasoleoA();
        lastGB = precios.getGasoleoB();
        lastGM = precios.getGasoleoMaritimo();

        // Añade una línea en blanco para mejor legibilidad
        System.out.println("\n");
    }
}