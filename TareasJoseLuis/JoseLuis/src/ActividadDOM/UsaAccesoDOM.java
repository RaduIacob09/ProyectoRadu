package ActividadDOM;

import ActividadDOM.AccesoDOM;
import java.io.File;

public class UsaAccesoDOM {

    public static void main(String[] args) {
        AccesoDOM a = new AccesoDOM();

        File f = new File("Libros.xml");//necesitamos Libros.xml en la ruta correcta

        a.abrirXMLaDOM(f);
        a.recorreDOMyMuestra();
        a.insertarLibroEnDOM("Giuliete", "David suarez", "22-4-20023");
        a.deleteNode("Giuliete");
        a.guardarDOMcomoArchivo("LibrosDeDOM.xml");
    }
}
