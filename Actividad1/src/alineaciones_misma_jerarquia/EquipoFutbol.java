package alineaciones_misma_jerarquia;

/**
 * Clase que representa un equipo de fútbol
 * Extiende de la clase Equipo
 * Contiene los atributos específicos de un equipo de fútbol
 * **/
public class EquipoFutbol extends Equipo {
    // Atributos para almacenar los jugadores de un equipo de fútbol
    private String portero;                      // Portero del equipo
    private String[] defensas = new String[5];   // Array de defensas
    private String[] centrocampistas = new String[5]; // Array de centrocampistas
    private String[] delanteros = new String[5];      // Array de delanteros
    private String[] suplentesLista;            // Lista de suplentes

    // Constructor: inicializa números de jugadores
    public EquipoFutbol() {
        this.num_titulares = 11;
        this.num_suplentes = 11;
        this.suplentesLista = new String[num_suplentes];
    }

    // Métodos para configurar las posiciones del equipo
    public void setPortero(String portero) {
        this.portero = portero;
    }

    public void setDefensas(String[] defensas) {
        // Bucle para agregar cada defensa al array
        for (int i = 0; i < defensas.length; i++) {
            this.defensas[i] = defensas[i];
        }
    }

    public void setCentrocampistas(String[] centrocampistas) {
        // Bucle para agregar cada centrocampista al array
        for (int i = 0; i < centrocampistas.length; i++) {
            this.centrocampistas[i] = centrocampistas[i];
        }
    }

    public void setDelanteros(String[] delanteros) {
        // Bucle para agregar cada delantero al array
        for (int i = 0; i < delanteros.length; i++) {
            this.delanteros[i] = delanteros[i];
        }
    }

    public void setSuplentes(String[] suplentes) {
        // Asigna la lista de suplentes
        this.suplentesLista = suplentes;
    }

    //Muestra la información del equipo

    public String toString() {
        // Creamos el String inicial con el título
        String resultado = "El equipo titular es el siguiente:\n";

        // Añadimos el portero
        resultado += "portero - " + portero + "\n";

        // Añadimos los defensas
        for (int i = 0; i < defensas.length; i++) {
            resultado += "defensa " + (i+1) + " " + defensas[i] + "\n";
        }

        // Añadimos los centrocampistas
        for (int i = 0; i < centrocampistas.length; i++) {
            resultado += "centro " + (i+1) + " " + centrocampistas[i] + "\n";
        }

        // Añadimos los delanteros
        for (int i = 0; i < delanteros.length; i++) {
            resultado += "delantero " + (i+1) + " " + delanteros[i] + "\n";
        }

        // Añadimos el título de suplentes
        resultado += "El equipo suplente es el siguiente:\n";

        // Añadimos cada suplente
        for (int i = 0; i < suplentesLista.length; i++) {
            resultado += suplentesLista[i] + ",\n";
        }

        return resultado;
    }
}