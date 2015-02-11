package edu.uniandes.ecos.psp0;

import edu.uniandes.ecos.psp0.Modelo.PuntoDosDimensiones;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
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
    public List<Double> obtenerFuenteDatosA() {
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
    public List<Double> obtenerFuenteDatosB() {
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

    /**
     * Método que lee un archivo
     *
     * @param rutaArchivo ubicación del archivo
     * @return el archivo en caso de que la ruta este correcta.
     */
    public File LeerArchivo(String rutaArchivo) {
        File archivoLeido = null;
        if (rutaArchivo == null || rutaArchivo.isEmpty()) {
            System.out.println("No se ha especificado la ruta del archivo!");
        }

        archivoLeido = new File(rutaArchivo);
        if (!archivoLeido.exists()) {
            System.out.println("El archivo " + rutaArchivo + " no existe");
        }

        return archivoLeido;
    }
    
     /**
     * Método que obtiene un listado de puntos de un archivo de texto
     *
     * @param rutaArchivo donde se encuentran los puntos. Los valores del punto
     * estaran separados por coma y cada punto, por saldo de línea.
     * @return colección de puntos leidos.
     */
    public LinkedList<PuntoDosDimensiones> obtenerPuntosDosDimensionesDeArchivo(String rutaArchivo) {
       LinkedList<PuntoDosDimensiones> lista = new LinkedList<PuntoDosDimensiones>();
        File file = this.LeerArchivo(rutaArchivo);
        if (file == null || !file.exists()) {
            System.out.println("No se puede leer. El archivo no existe!");
        }

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(fileReader);
            String nextLine = null;
            PuntoDosDimensiones punto = null;
            while ((nextLine = buffer.readLine()) != null) {
                try {
                    if (!nextLine.trim().isEmpty()) {
                        String[] valores = nextLine.split(",");
                        punto = new PuntoDosDimensiones(Double.parseDouble(valores[0]), Double.parseDouble(valores[1]));

                        lista.add(punto);
                        System.out.println("Se adicionó el punto: " + punto.toString());
                    }
                } catch (Exception ex) {
                    System.out.println("Puntos inválidos: " + nextLine + ". Error: " + ex.getMessage());
                }
            }
            buffer.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error al intentar leer el archivo!");
            //e.printStackTrace();
        }
        return lista;
    }
}
