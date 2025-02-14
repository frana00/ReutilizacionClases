package alineaciones_misma_jerarquia_extension;

public class GenerarEquipos {
    public static void main(String[] args) {
        // Creamos las diferentes alineaciones
        AlineacionFutbol listaFutbol = new AlineacionFutbol();
        AlineacionLol roasterLol = new AlineacionLol();
        AlineacionBaloncesto listaBasket = new AlineacionBaloncesto();

        // Generamos equipo de fútbol
        Entrenador misterFutbol = new Entrenador(listaFutbol);
        System.out.println("\n\n===========> Diseñando equipo de fútbol <===============");
        Equipo ef = misterFutbol.decideAlineacion();
        System.out.println("\n\n================> Equipo de fútbol <====================");
        System.out.println(ef.toString());

        // Generamos equipo de LoL
        Entrenador misterLol = new Entrenador(roasterLol);
        System.out.println("\n\n===========> Diseñando equipo de LoL <===============");
        Equipo el = misterLol.decideAlineacion();
        System.out.println("\n\n================> Equipo de LoL <====================");
        System.out.println(el.toString());

        // Generamos equipo de baloncesto
        Entrenador misterBasket = new Entrenador(listaBasket);
        System.out.println("\n\n===========> Diseñando equipo de baloncesto <===============");
        Equipo eb = misterBasket.decideAlineacion();
        System.out.println("\n\n================> Equipo de baloncesto <====================");
        System.out.println(eb.toString());
    }
}