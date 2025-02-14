package preciosCarburantes.version2;

/**
 * Clase principal que demuestra el funcionamiento del patrón Observer
 * para el seguimiento de precios de carburantes
 * Versión 2: Incluye visualización en texto además de instantánea y estadísticas
 */
public class Main {
    public static void main(String[] args) {
        // Creamos el sujeto observable que mantendrá los precios
        PreciosCarburantes datos = new PreciosCarburantes();

        // Creamos los tres observadores y los registramos automáticamente
        Instantaneo instantaneo = new Instantaneo(datos);     // Muestra precios actuales
        Estadisticas estadisticas = new Estadisticas(datos);  // Muestra estadísticas
        Texto texto = new Texto(datos);  // Novedad en la versión 2: Muestra "histograma"

        // Simulamos cambios en los precios para demostrar las notificaciones
        // Cada llamada a establecerEstado provocará una notificación a todos los observadores

        // Primera actualización: precios iniciales
        datos.establecerEstado(100,200,10,5,2);

        // Segunda actualización: algunos incrementos moderados
        datos.establecerEstado(200,230,10,55,10);

        // Tercera actualización: incrementos significativos
        datos.establecerEstado(270,280,110,95,110);

        // Cuarta actualización: cambios finales
        datos.establecerEstado(350,325,300,100,110);
    }
}