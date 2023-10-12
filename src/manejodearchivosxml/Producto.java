
package manejodearchivosxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author mont_
 */

@XmlRootElement(name="Productos")
@XmlAccessorType(XmlAccessType.FIELD)
public class Producto {
     @XmlAttribute
    private String nombre;

    
    private double precio;

     private String descripcion;

    public Producto() {
    }

    public Producto(String nombre, double precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

     
    /**
     * Get the value of descripcion
     *
     * @return the value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Get the value of precio
     *
     * @return the value of precio
     */
    public double getPrecio() {
        return precio;
    }
public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Producto: nombre: " + nombre + ", precio: " + precio + ", descripcion: " + descripcion;
    }



}
