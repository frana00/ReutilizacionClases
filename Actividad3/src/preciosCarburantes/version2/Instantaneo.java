package preciosCarburantes.version2;

/**
 * Clase que implementa un observador que muestra los precios actuales
 * de todos los carburantes
 */
public class Instantaneo implements Observador {
    // Referencia al sujeto observable que mantiene los precios
    private PreciosCarburantes precios;

    /**
     * Constructor que inicializa el observador y lo registra con el sujeto
     */
    public Instantaneo(PreciosCarburantes precios) {
        this.precios = precios;
        precios.registrarObservador(this);
    }

    /**
     * Actualiza la visualización cuando hay cambios en los precios
     * Muestra una lista formateada con los precios actuales de todos
     * los tipos de carburante
     */
    @Override
    public void actualizar() {
        System.out.println("PRECIOS ACTUALES");
        System.out.println("GASOLINA 95 E5 " + precios.getGasolina95E5() + " €");
        System.out.println("GASOLINA 95 E10 " + precios.getGasolina95E10() + " €");
        System.out.println("GASOLEO A " + precios.getGasoleoA() + " €");
        System.out.println("GASOLEO B " + precios.getGasoleoB() + " €");
        System.out.println("GASOLEO MARITIMO " + precios.getGasoleoMaritimo() + " €\n\n");
    }
}