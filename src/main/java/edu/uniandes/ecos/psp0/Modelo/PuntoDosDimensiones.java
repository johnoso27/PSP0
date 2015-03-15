package edu.uniandes.ecos.psp0.Modelo;

/**
 * Clase que representa un punto de dos dimensiones
 *
 * @author JohnDany
 */
public class PuntoDosDimensiones {

    /**
     * Incializa una nueva instancia de la clase PuntoDosDimensiones
     *
     * @param x valor horizontal del punto
     * @param y valor veertical del punto
     */
    public PuntoDosDimensiones(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    /*
     Obtiene o establece el valor horizontal del punto.
     */
    public Double x;

    /*
     Obtiene o establece el valor vertical del punto.
     */
    public Double y;

    /**
     * Se sobreescribe el método toString
     *
     * @return los valores de X y Y como una cadena.
     */
    @Override
    public String toString() {
        return "X:" + this.x + " Y:" + this.y;
    }
}
