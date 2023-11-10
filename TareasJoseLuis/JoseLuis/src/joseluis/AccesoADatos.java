package joseluis;

import java.util.Scanner;

public class AccesoADatos {

    public static void main(String[] args) {
        int numero1, numero2, resultado;
        Scanner teclado = new Scanner (System.in);
        try {
        System.out.println("Dame un numero: ");
        numero1 = teclado.nextInt();
        
        System.out.println("Dame otro numero: ");
        numero2 = teclado.nextInt();
        
        resultado = numero1 / numero2;
        System.out.println("El resultado es: "+resultado);
        } catch (Exception e) {
            System.out.println("No se ha podido realizar la operacion");
        }
    }
    
}
