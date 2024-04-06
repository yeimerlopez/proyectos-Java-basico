package inputandoutput;

import java.util.Scanner;

public class InputAndOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Para poder recibir datos por parte de usuario necesitamos
        -- importar la libreria Scanner desde javaUtil
        --  crear una nueva instancia de ella
        */
        
        Scanner entradaDatos = new Scanner(System.in);
        int numero;
        float numero2;
        double numero3;
        String cadena;
        
        
        
        System.out.println("Digita un numero; ");
        numero = entradaDatos.nextInt();
        System.out.println("Dejame adivinar el numero es: " + numero);
        System.out.println("Ahora ingresa un numero decimal por favor");
        try {
            numero2 = entradaDatos.nextFloat();
            System.out.println("acabas de ingresar el siguiente decimal: " + numero2);
        } catch (Exception e) {
            System.out.println("Verifica lo que acabas de ingresa!!");
        }
        
        System.out.println("Ingresa un valor de tipo dooble");
        numero3 = entradaDatos.nextDouble();
        System.out.println("El double que ingresaste es: " + numero3);
        
        System.out.println("Ingresa una cadena valida");
        cadena = entradaDatos.nextLine();
        System.out.println("la cadena es: " + cadena);
        
        
        
    }
    
}
