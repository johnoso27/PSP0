package edu.uniandes.ecos.psp0;

import java.util.List;

/**
 * Clase que realiza operaciones sobre coleccioes de números
 *
 * @author JohnDany
 */
public class Negocio {

    /**
     * Método que calcuala la media de un listado de números
     *
     * @param datos listado de números para calcularle la media
     * @return la media de la lista ingresada.
     */
    public Double calcularMedia(List<Double> datos) {
        System.out.println("Iniciando cálculo de la media");
        System.out.println("Datos: " + datos);
        
        Double sumatoria = 0.0;
        
        for (Double dato : datos) {
            sumatoria = sumatoria + dato;
        }
        
        Double media = sumatoria / datos.size();
        System.out.println("Media: " + media);
        System.out.println();
        
        return media;
    }

    /**
     * Método que calcula la desviación estandar de un listado de números.
     *
     * @param datos listado de datos a calacular la desviación estandar
     * @return la desviación estandar de los datos parametrizados
     */
    public Double calcularDesviacionEstandar(List<Double> datos) {   
        Double media = this.calcularMedia(datos);
        System.out.println("Iniciando cálculo de la desviación estandar");
        System.out.println("Media: " + datos); 
        Double sumatoria = 0.0;
        
        for (Double dato : datos) {
            sumatoria = sumatoria + Math.pow((dato - media), 2);
        }
        
        Double desviacion = Math.sqrt(sumatoria / (datos.size() - 1));
        System.out.println("Desviación estandar: " + desviacion);
        System.out.println();
        
        return  desviacion;
    }
}
