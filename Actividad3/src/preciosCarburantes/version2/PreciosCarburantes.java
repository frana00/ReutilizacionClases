package preciosCarburantes.version2;

import java.util.ArrayList;

/**
 * Clase que implementa el sujeto observable
 * Mantiene los precios de los diferentes tipos de carburantes y notifica
 * a los observadores cuando estos cambian
 */
public class PreciosCarburantes implements Sujeto {
    private ArrayList<Observador> observadores;  // Lista de observadores registrados
    private double gasolina95E5;    // Precio de Gasolina 95 E5
    private double gasolina95E10;   // Precio de Gasolina 95 E10
    private double gasoleoA;        // Precio de Gasóleo A
    private double gasoleoB;        // Precio de Gasóleo B
    private double gasoleoMaritimo; // Precio de Gasóleo Marítimo

    /**
     * Constructor que inicializa la lista de observadores
     */
    public PreciosCarburantes() {
        observadores = new ArrayList<Observador>();
    }

    /**
     * Registra un nuevo observador en la lista
     */
    @Override
    public void registrarObservador(Observador o) {
        observadores.add(o);
    }

    /**
     * Elimina un observador de la lista
     */
    @Override
    public void borrarObservador(Observador o) {
        observadores.remove(o);
    }

    /**
     * Notifica a todos los observadores registrados sobre cambios en los precios
     */
    @Override
    public void notificar() {
        System.out.println("Notificando ...\n");
        for (Observador o : observadores) {
            o.actualizar();
        }
    }

    // Métodos getter para acceder a los precios
    public double getGasolina95E5() {
        return gasolina95E5;
    }

    public double getGasolina95E10() {
        return gasolina95E10;
    }

    public double getGasoleoA() {
        return gasoleoA;
    }

    public double getGasoleoB() {
        return gasoleoB;
    }

    public double getGasoleoMaritimo() {
        return gasoleoMaritimo;
    }

    /**
     * Métodos setter individuales para cada tipo de carburante
     * Cada uno actualiza el precio correspondiente y notifica a los observadores
     */
    public void setGasolina95E5(double precio) {
        this.gasolina95E5 = precio;
        notificar();
    }

    public void setGasolina95E10(double precio) {
        this.gasolina95E10 = precio;
        notificar();
    }

    public void setGasoleoA(double precio) {
        this.gasoleoA = precio;
        notificar();
    }

    public void setGasoleoB(double precio) {
        this.gasoleoB = precio;
        notificar();
    }

    public void setGasoleoMaritimo(double precio) {
        this.gasoleoMaritimo = precio;
        notificar();
    }

    /**
     * Método para establecer los precios
     */
    public void establecerEstado(double g95e5, double g95e10, double gA, double gB, double gM) {
        this.gasolina95E5 = g95e5;
        this.gasolina95E10 = g95e10;
        this.gasoleoA = gA;
        this.gasoleoB = gB;
        this.gasoleoMaritimo = gM;
        notificar();
    }
}