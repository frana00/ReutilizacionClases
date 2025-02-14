package preciosCarburantes.version1;

/**
 * Clase principal que demuestra el funcionamiento del patrón Observer
 * para el seguimiento de precios de carburantes
 */
public class Main {
    public static void main(String[] args) {
        // Crear el sujeto observable (fuente de datos de precios)
        PreciosCarburantes datos = new PreciosCarburantes();

        // Crear los observadores y registrarlos automáticamente
        // (el registro se hace en el constructor de cada observador)
        Instantaneo instantaneo = new Instantaneo(datos);     // Visualización de precios actuales
        Estadisticas estadisticas = new Estadisticas(datos);  // Visualización de cambios

        // Simular una secuencia de cambios en los precios
        // Para cada llamada a establecerEstado:
        // - Se actualizan todos los precios
        // - Se notifica a los observadores
        // - Los observadores muestran la información según su implementación

        // Primera actualización: establecer precios iniciales
        datos.establecerEstado(100,200,10,5,2);

        // Segunda actualización: algunos precios suben
        datos.establecerEstado(200,230,10,55,10);

        // Tercera actualización: incrementos significativos
        datos.establecerEstado(270,280,110,95,110);

        // Cuarta actualización: últimos cambios de precios
        datos.establecerEstado(350,325,300,100,110);
    }
}