/*
 En un nuevo proyecto, crear una clase de nombre Fecha con los siguientes atributos: dia,
mes, año; un constructor que permita inicializar a todos sus atributos; los métodos getter y
setter para sus atributos y los siguientes métodos adicionales:
 esBisiesto(): Este método retornará true si el año de esta Fecha es bisiesto; caso contrario
retornará false.
 calcularAños(): Este método recibirá un objeto del tipo Fecha y retornará un entero que
será la cantidad de años transcurridos entre esta Fecha y la que recibe por parámetro.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear dos objetos de tipo fecha.
Utilizando sus métodos:
b) Mostrar por consola si la primera fecha y la segunda corresponden a años bisiestos.
c) Mostrar por consola, la cantidad de años transcurridos entre la primera fecha y la segunda.
 */
package guia.pkg2.ejercico.pkg9;

/**
 *
 * @author Usuario
 */
public class Guia2Ejercico9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Fecha f1=new Fecha("lunes","agosto",2001 );
        Fecha f2=new Fecha("martes","septiembre",2024);
        
        if(f1.esBisiesto()){
            System.out.println("Es bisiesto");
        }else{
            System.out.println("No es bisiesto");
        }
        if(f2.esBisiesto()){
            System.out.println("Es bisiesto");
        }else{
            System.out.println("No es bisiesto");
        }
        
        System.out.println(Fecha.calcularAño(f1, f2));
    }
    
}
