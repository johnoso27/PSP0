package edu.uniandes.ecos;

import java.util.List;

/**
 * Clase principal del programa para calcular la media y la desviación estandar.
 *
 */
public class App {

    /**
     * Método principal de la aplicación
     * @param args
     */
    public static void main(String[] args) {

        Fuente fuente = new Fuente();
        Negocio negocio = new Negocio();

        List<Double> datos = fuente.obtenerFuenteDatos();
        negocio.calcularDesviacionEstandar(datos);

        List<Double> datosA = fuente.obtenerFuenteDatosA();
        negocio.calcularDesviacionEstandar(datosA);

        List<Double> datosB = fuente.obtenerFuenteDatosB();
        negocio.calcularDesviacionEstandar(datosB);
    }
}
