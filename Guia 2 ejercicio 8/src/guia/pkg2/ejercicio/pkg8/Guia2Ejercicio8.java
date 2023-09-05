/*
En un nuevo proyecto, crear una clase de nombre Calculo con los siguientes métodos estáticos:
 esPrimo(): Este método recibe un número entero y retorna true si el número recibido es
primo, caso contrario retornará false.
 valorAbsoluto(): Este método recibe un número entero y retorna su valor absoluto.
 calcularRices(): Este método recibe los coeficientes a, b y c de una ecuación de segundo
grado y mostrará por consola sus raíces y si no las tiene también lo informará.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:

Utilizando los métodos estáticos de la clase Calculo:
a) Informar por consola si un número escogido por usted es primo o no.
b) Mostrar por consola el valor absoluto del valor -90;
c) Mostrar las raíces de la ecuación de segundo grado con los coeficientes: 1, 0 y 9.
 */
package guia.pkg2.ejercicio.pkg8;

/**
 *
 * @author Usuario
 */
public class Guia2Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      if(Calculo.esPrimo(24)){
          System.out.println("Es primo");
      }else{
          System.out.println("No es primo");
      }
      
        System.out.println("El valor absoluto es: " + Calculo.valorAbsoluto(-90) );
        Calculo.calcularRaices(1, 0, 9);
    }
    
    
  
}
