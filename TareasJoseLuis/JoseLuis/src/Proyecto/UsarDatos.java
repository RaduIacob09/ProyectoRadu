package Proyecto;


import java.io.File;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class UsarDatos {

    public static void main(String[] args) throws SAXException, ParserConfigurationException {
        DatosLibros acceso = new DatosLibros();
        File file = new File("./books.xml");
        
        acceso.abrirArchivoDOM(file);
        acceso.eliminarLibroDOM("XML Developer's Guide");
        acceso.anadirLibroDOM("Los 3 Mosqueteros", "radu", "2023-08-19", "Dibujo", "Aventura de unos personajes" , 19.95);
        acceso.pedirLibroDom();
        acceso.guardarArchivoDOM("./booksCreado.xml");
    }
    
}
