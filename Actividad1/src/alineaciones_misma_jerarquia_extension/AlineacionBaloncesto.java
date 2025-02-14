package alineaciones_misma_jerarquia_extension;

public class AlineacionBaloncesto implements Alineacion {
    private EquipoBaloncesto equipo;

    public AlineacionBaloncesto() {
        this.equipo = new EquipoBaloncesto();
    }

    public void primeraLinea() {
        System.out.println("Base: jugador 1");
        equipo.setBase("Jugador 1");
    }

    public void segundaLinea() {
        System.out.println("Pivot1: jugador 2. Pivot2: jugador 3");
        equipo.setPivots(new String[]{"Jugador 2", "Jugador 3"});
    }

    public void terceraLinea() {
        System.out.println("Alero1: jugador 4. Alero2: jugador 5");
        equipo.setAleros(new String[]{"Jugador 4", "Jugador 5"});
    }

    public void suplentes() {
        System.out.println("Suplentes balonesto: base2, pivot2.1, pivot2.2, alero2.1, alero2.2");
        equipo.setSuplentes(new String[]{"base2", "pivot2.1", "pivot2.2", "alero2.1", "alero2.2"});
    }

    public void portero() {
        System.out.println("Baloncesto no tiene portero");
    }

    public Equipo generarEquipo() {
        System.out.println("Se ha generado ya el equipo de basket\n");
        return equipo;
    }
}