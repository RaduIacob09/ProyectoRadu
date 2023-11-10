package joseluis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente {
    int id_cliente;
    String nombre, direccion, telefono;

    public Cliente(int id_cliente, String nombre, String direccion, String telefono) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    public void visualizar(){
        System.out.println("ID del cliente: "+id_cliente);
        System.out.println("Nombre del cliente: "+nombre);
        System.out.println("Direccion del cliente: "+direccion);
        System.out.println("Telefono del cliente: "+telefono);
    }
    
    void pedirDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime los datos de un cliente: ");
        this.id_cliente = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Nombre: ");
        this.nombre = teclado.nextLine();
        
        System.out.println("Direccion: ");
        this.direccion = teclado.nextLine();
        
        System.out.println("Telefono: ");
        this.telefono = teclado.nextLine();
    }
    void guardarDatos() throws IOException{
        String archivo = "archivo.txt";
        File archivo1 = new File(archivo);
        
        try (BufferedWriter escritura = new BufferedWriter(new FileWriter(archivo1))){
             escritura.write(this.toString());
        } catch (InputMismatchException e) {
            System.out.println("NO furula");
        }
        
    }
}
