package alineaciones_misma_jerarquia_extension;

public class EquipoBaloncesto extends Equipo {
    private String base;
    private String[] pivots;
    private String[] aleros;
    private String[] suplentes;

    public EquipoBaloncesto() {
        this.pivots = new String[2];
        this.aleros = new String[2];
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setPivots(String[] pivots) {
        this.pivots = pivots;
    }

    public void setAleros(String[] aleros) {
        this.aleros = aleros;
    }

    public void setSuplentes(String[] suplentes) {
        this.suplentes = suplentes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("El equipo titular es el siguiente : base - ").append(base).append("\n");
        sb.append(" pivot 1 - ").append(pivots[0]).append("\n");
        sb.append(" pivot 2 - ").append(pivots[1]).append("\n");
        sb.append(" alero 1 - ").append(aleros[0]).append("\n");
        sb.append(" alero 2 - ").append(aleros[1]).append("\n");
        sb.append("El equipo suplente es el siguiente:   ");
        sb.append(String.join(", ", suplentes));
        return sb.toString();
    }
}