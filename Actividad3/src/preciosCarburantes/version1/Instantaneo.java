package preciosCarburantes.version1;

/**
 * Clase que implementa un observador que muestra los precios actuales de forma inmediata
 * Proporciona una visualización simple y directa de todos los precios vigentes
 */
public class Instantaneo implements Observador {
    // Referencia al sujeto observable (fuente de datos de precios)
    private PreciosCarburantes precios;

    /**
     * Constructor de la clase Instantaneo
     */
    public Instantaneo(PreciosCarburantes precios) {
        // Guarda la referencia al objeto observable
        this.precios = precios;
        // Registra esta instancia como observador del sujeto
        precios.registrarObservador(this);
    }

    /**
     * Método que se ejecuta cada vez que hay un cambio en los precios
     * Muestra una visualización instantánea de todos los precios actuales
     */
    public void actualizar() {
        System.out.println("PRECIOS ACTUALES");

        // Muestra cada precio actual con su etiqueta correspondiente
        // y el símbolo del euro (€)
        System.out.println("GASOLINA 95 E5 " + precios.getGasolina95E5() + " €");
        System.out.println("GASOLINA 95 E10 " + precios.getGasolina95E10() + " €");
        System.out.println("GASOLEO A " + precios.getGasoleoA() + " €");
        System.out.println("GASOLEO B " + precios.getGasoleoB() + " €");
        System.out.println("GASOLEO MARITIMO " + precios.getGasoleoMaritimo() + " €\n\n");
    }
}