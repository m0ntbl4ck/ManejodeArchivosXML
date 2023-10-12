
package manejodearchivosxml;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author mont_
 */
public class EscribirProductoXML {
    
    public static void escribirXML(){
        Producto pro =  new Producto("MacBook Pro",400.00,"La ultima MacBook Pro de Apple");
        
        try {
            JAXBContext jc = JAXBContext.newInstance(Producto.class);
            
            Marshaller m = jc.createMarshaller();
            
            m.marshal(pro, new File("producto.xml"));
            System.out.println("El archivo XML fue creado exitosamente ");
            m.marshal(pro, System.out);
            
        } catch (JAXBException e) {
            System.out.println("JAXB Excepcion: "+ e.getMessage());
        }
    }
}
