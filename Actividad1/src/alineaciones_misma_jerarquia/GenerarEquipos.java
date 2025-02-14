package alineaciones_misma_jerarquia;

public class GenerarEquipos {
    public static void main(String[] args) {
        AlineacionLol roasterLol = new AlineacionLol();
        AlineacionFutbol listaFutbol = new AlineacionFutbol();


        Entrenador coachLol = new Entrenador(roasterLol);
        System.out.println(
                "\n\n===============> Diseñando equipo de lol <==================");
        Equipo eb = coachLol.decideAlineacion();
        System.out.println(
                "\n\n================> Equipo de lol <===========================");
        System.out.println(eb.toString());

        Entrenador misterFutbol = new Entrenador(listaFutbol);
        System.out.println(
                "\n\n==============> Diseñando equipo de fútbol <================");
        Equipo ef = misterFutbol.decideAlineacion();
        System.out.println(
                "\n\n==============> Equipo de fútbol <==========================");
        System.out.println(ef.toString());

    }
}
