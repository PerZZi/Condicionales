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
public class Calculo {
    public static boolean esPrimo(int num){
        int contador=0;
        for(int i=1;i<=num;i++){
        if(num%i==0){
            contador++;
        }
    }
    return contador==2;
    }
    public static int valorAbsoluto(int numero){
        return Math.abs(numero);
    }
    public static void calcularRaices(int a,int b, int c){
        double deter,raiz1,raiz2;
        deter=Math.pow(b, 2)-4*a*c;
        if(deter>=0){
        
        raiz1=(-b+Math.sqrt(deter))/2*a;
        raiz2=(b-Math.sqrt(deter))/2*a;
        System.out.println("Raiz 1 : " + raiz1 );
        System.out.println("Raiz 2 : " + raiz2 ) ;
        
    }else{
        System.out.println("No admite solucion");
}
    }
}