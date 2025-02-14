package preciosCarburantes.version2;

public class Estadisticas implements Observador {
    private PreciosCarburantes precios;
    private double lastG95E5, lastG95E10, lastGA, lastGB, lastGM;

    public Estadisticas(PreciosCarburantes precios) {
        this.precios = precios;
        precios.registrarObservador(this);
        lastG95E5 = lastG95E10 = lastGA = lastGB = lastGM = 0.0;
    }

    @Override
    public void actualizar() {
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

        // Actualizar últimos valores
        lastG95E5 = precios.getGasolina95E5();
        lastG95E10 = precios.getGasolina95E10();
        lastGA = precios.getGasoleoA();
        lastGB = precios.getGasoleoB();
        lastGM = precios.getGasoleoMaritimo();

        System.out.println("\n");
    }
}