package preciosCarburantes.version2;

/**
 * Clase que implementa una visualización en forma de "histograma" de los precios
 * Cada tipo de carburante se representa con un carácter diferente
 * La longitud de cada línea es proporcional al precio (1 carácter = 10 unidades)
 */
public class Texto implements Observador {
    // Referencia al sujeto observable que mantiene los precios
    private PreciosCarburantes precios;

    /**
     * Constructor que inicializa el observador y lo registra con el sujeto
     */
    public Texto(PreciosCarburantes precios) {
        this.precios = precios;
        precios.registrarObservador(this);
    }

    /**
     * Actualiza la visualización cuando hay cambios en los precios
     * Muestra un "histograma" donde:
     * - 'a': representa Gasolina 95 E5
     * - 'b': representa Gasolina 95 E10
     * - 'A': representa Gasóleo A
     * - 'B': representa Gasóleo B
     * - 'M': representa Gasóleo Marítimo
     * La longitud de cada línea es el precio dividido por 10
     */
    @Override
    public void actualizar() {
        // Visualización en forma de histograma usando caracteres
        System.out.println("a".repeat((int)(precios.getGasolina95E5()/10)));    // Línea para Gasolina 95 E5
        System.out.println("b".repeat((int)(precios.getGasolina95E10()/10)));   // Línea para Gasolina 95 E10
        System.out.println("A".repeat((int)(precios.getGasoleoA()/10)));        // Línea para Gasóleo A
        System.out.println("B".repeat((int)(precios.getGasoleoB()/10)));        // Línea para Gasóleo B
        System.out.println("M".repeat((int)(precios.getGasoleoMaritimo()/10))); // Línea para Gasóleo Marítimo
        System.out.println("\n"); // Separador entre actualizaciones
    }
}