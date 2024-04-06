/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables;

/**
 *
 * @author yeimer
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        /*
        variables de tipo entero 
        -- byte: Representa un entero de 8 bits con signo. Su rango va desde -128 hasta 127.
        -- short: Representa un entero de 16 bits con signo. Su rango va desde -32,768 hasta 32,767.
        -- int: Representa un entero de 32 bits con signo. Es el tipo de dato numérico más comúnmente utilizado en Java.
           Su rango va desde -2,147,483,648 hasta 2,147,483,647.
        -- long: Representa un entero de 64 bits con signo. Para especificar que un valor literal es de tipo long,
           se debe agregar una "L" o "l" al final del valor. Su rango va desde -9,223,372,036,854,775,808
           hasta 9,223,372,036,854,775,807.
        
        */
        
        byte variableByte = 127;
        short variableShort = 32767;
        int variableInt = 2147483647;
        long variableLong = 92233572; // Verificar este valor
        
        System.out.println("Soy la variable tipo byte y este es mi maximo valor: " + variableByte); //127
        System.out.println("Soy la variable tipo short y este es mi maximo valor" + variableShort);
        System.out.println("soy variableInt y mi maximo es 2,147,483,647 sin las comas asi: " + variableInt);
        
        /*
            para los decimales usamos float y double
        
        */
        
        float numeroDecimal = 3.1416f; //Para el float no hay que poner la f
        double variableDouble = 34.25688; // No necesita de la f
        
        System.out.println("soy la variable numeroDecimal y este es mi valor actual:  " + numeroDecimal);
        System.out.println("Soy la variable double mira mi valor: " + variableDouble);
        
        /*
            Variables de tipo caracter como a b c d f g h i j 1 2 3 
            para este tipo de variables se usa char como se ve a continuacion
        */
        
        char soyCaracter = 'a';
        
        System.out.println("mi nombre es soyCaracter y en este momento guardo el siguiente caracter:  " + soyCaracter);
        
        /*
            variables de tipo booleano como true o false
        */
        
        boolean decision = true;
        
        System.out.println("Soy la variable decision y en este momento mi valor es: " + decision);
        
        
        
        
        
    }
    
}
