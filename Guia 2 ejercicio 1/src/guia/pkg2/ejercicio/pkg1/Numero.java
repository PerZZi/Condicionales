/*
En un nuevo proyecto crear una clase de nombre Numero, con un atributo de tipo entero, un
constructor que permita inicializar dicho atributo, los métodos getter y setter y los siguientes
métodos adicionales:
 esPar: este método retornará true si el valor guardado en el atributo es par, caso contrario
retornará false.
 esPositivo: este método retornará true si el valor guardado en el atributo es mayor o igual
a cero, caso contrario retornará false.
 esMultiploDe: este método recibirá un valor por parámetro y retornará true si el valor
guardado en el atributo es múltiplo del valor recibido, caso contrario retornará false.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:

a) Crear un objeto Numero con el valor 1459
Luego utilizando sus métodos:
b) Mostrar por consola si es par o no.
c) Mostrar por consola si es positivo o no.
d) Mostrar por consola si es múltiplo de 3.
 */
package guia.pkg2.ejercicio.pkg1;

public class Numero {
    
    private int num;

    public Numero(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public static void Numero (int num){
        
    }
    public boolean esPar(){
        return this.num%2==0;
    
}
    public boolean esPositivo(){
        return this.num>=0;
    }
    
    public boolean esMultiplo(int otro){
       return otro% this.num==0;
    }
}
              
