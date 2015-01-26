package edu.uniandes.ecos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que provee una fuente de datos.
 *
 * @author JohnDany
 */
public class Fuente {

    /*
     *Este método retorna una lista de números    
     */
    public List<Double> obtenerFuenteDatos() {
        List<Double> lista = new ArrayList<Double>();
        lista.add(186.0);
        lista.add(699.0);
        lista.add(132.0);
        lista.add(272.0);
        lista.add(291.0);
        lista.add(331.0);
        lista.add(199.0);
        lista.add(1890.0);
        lista.add(788.0);
        lista.add(1601.0);
        return lista;
    }
    
     /*
     *Este método retorna una lista de números    
     */
    public List<Double> obtenerFuenteDatosA() 
    {
        List<Double> lista = new ArrayList<Double>();
        lista.add(160.0);
        lista.add(591.0);
        lista.add(114.0);
        lista.add(229.0);
        lista.add(230.0);
        lista.add(270.0);
        lista.add(128.0);
        lista.add(1657.0);
        lista.add(624.0);
        lista.add(1503.0);
        return lista;
    }
    
     /*
     *Este método retorna una lista de números    
     */
    List<Double> obtenerFuenteDatosB() 
    {
        List<Double> lista = new ArrayList<Double>();
        lista.add(15.0);
        lista.add(69.9);
        lista.add(6.5);
        lista.add(22.4);
        lista.add(28.4);
        lista.add(65.9);
        lista.add(19.4);
        lista.add(198.7);
        lista.add(38.8);
        lista.add(138.2);
        return lista;
    }
}
