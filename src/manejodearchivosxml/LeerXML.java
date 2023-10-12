/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejodearchivosxml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author mont_
 */
public class LeerXML {
  
        public static void leerXML(){
   
        
        try {
            JAXBContext jc = JAXBContext.newInstance(Producto.class);
            
            Unmarshaller un = jc.createUnmarshaller();
            
            InputStream en = new FileInputStream("producto.xml");
            
            Producto pro = (Producto) un.unmarshal(en);
            System.out.println("El archivo XML fue leido exitosamente ");
             System.out.println("\n");
             System.out.println(pro);
            
             
        } catch (JAXBException | IOException e) {
            System.out.println(e.getMessage());
        }
}
    
}
