package edu.uniandes.ecos;

import edu.uniandes.ecos.psp0.Modelo.Negocio;
import edu.uniandes.ecos.psp0.Modelo.Fuente;
import java.util.List;
import junit.framework.TestCase;

/**
 * Clase donde se ejecutan las pruebas de unidad.
 *
 * @author JohnDany
 */
public class NegocioTest extends TestCase {

    /**
     * Test para el método CalcularMedia, de la clase Negocio.
     */
    public void testCalcularMedia() {

        System.out.println("Test del método 'calcularMedia'");
        List<Double> datos;
        Negocio instance = new Negocio();
        Fuente fuente = new Fuente();
        
        System.out.println("Primera prueba del cálculo de la media:");
        datos = fuente.obtenerFuenteDatos();
        Double expResult = 638.9;
        Double result = instance.calcularMedia(datos);
        assertEquals(expResult, result, 0.5);

        System.out.println("Seguanda prueba del cálculo de la media:");
        datos = fuente.obtenerFuenteDatosA();
        Double expResultA = 550.6;
        Double resultA = instance.calcularMedia(datos);
        assertEquals(expResultA, resultA, 0.5);
        
        System.out.println("Tercera prueba del cálculo de la media:");
        datos = fuente.obtenerFuenteDatosB();
        Double expResultB = 60.32;
        Double resultB = instance.calcularMedia(datos);
        assertEquals(expResultB, resultB, 0.5);
    }

    /**
     * Test para el método CalcularDerivacionEstandar, de la clase Negocio.
     */
    public void testCalcularDesviacionEstandar() {
        System.out.println("Test del método 'calcularDesviacionEstandar'");
        Fuente fuente = new Fuente();
        Negocio instance = new Negocio();
        
        System.out.println("Primera prueba del cálculo de la desviación estandar:");
        List<Double> datos = fuente.obtenerFuenteDatos();        
        Double expResult = 625.6;
        Double result = instance.calcularDesviacionEstandar(datos);
        assertEquals(expResult, result, 0.5);
        
        System.out.println("Segunada prueba del cálculo de la desviación estandar:");
        datos = fuente.obtenerFuenteDatosA();        
        Double expResultA = 572.03;
        Double resultA = instance.calcularDesviacionEstandar(datos);
        assertEquals(expResultA, resultA, 0.5);
        
        System.out.println("Tercera prueba del cálculo de la desviación estandar:");
        datos = fuente.obtenerFuenteDatosB();        
        Double expResultB = 62.26;
        Double resultB = instance.calcularDesviacionEstandar(datos);
        assertEquals(expResultB, resultB, 0.5);
    }
}
