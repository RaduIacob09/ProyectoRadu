package Proyectos;

import java.io.File;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class AD_Proyecto1_RCI {

    public static void main(String[] args) throws SAXException, ParserConfigurationException {
        AccesoDOM acceso = new AccesoDOM();
        File file = new File("./books.xml");
        
        acceso.abrirArchivoDOM(file);
        acceso.eliminarLibroDOM("XML Developer's Guide");
        acceso.anadirLibroDOM("Los 3 Mosqueteros", "radu", "2023-08-19", "Dibujo", "Aventura de unos personajes" , 19.95);
        acceso.pedirLibroDom();
        acceso.guardarArchivoDOM("./booksCreado.xml");
    }
    
}
