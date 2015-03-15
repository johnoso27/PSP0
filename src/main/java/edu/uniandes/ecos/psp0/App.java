package edu.uniandes.ecos.psp0;

import edu.uniandes.ecos.psp0.Modelo.Negocio;
import edu.uniandes.ecos.psp0.Modelo.Fuente;
import java.util.List;

/**
 * Clase principal del programa para calcular la media y la desviación estandar.
 *
 */
public class App {

    /**
     * Método principal de la aplicación
     *
     * @param args. Colección de string para pasarle como argumento al método
     * principal.
     */
    public static void main(String[] args) {
        try {
            ejecutarOperaciones();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Método que ejecuta las operaciones del calculo de la desviasión estandar
     * de varias fuentes de datos.
     */
    public static void ejecutarOperaciones() {
        Fuente fuente = new Fuente();
        Negocio negocio = new Negocio();

        List<Double> datos = fuente.obtenerFuenteDatos();
        negocio.calcularDesviacionEstandar(datos);

        List<Double> datosA = fuente.obtenerFuenteDatosA();
        negocio.calcularDesviacionEstandar(datosA);

        List<Double> datosB = fuente.obtenerFuenteDatosB();
        negocio.calcularDesviacionEstandar(datosB);
        
        List<Double> datosDesdeArchivo = fuente.obtenerListaNumerosDesdeArchivo("src/site/resourses/ArchivoPrueba/ListaNumeros.txt");
        negocio.calcularDesviacionEstandar(datosDesdeArchivo);
    }
}
