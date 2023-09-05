/*
En un nuevo proyecto, crear una clase de nombre Pensador con un atributo que almacenará
un valor entero; un constructor que permita inicializar dicho atributo; los métodos get y set para
dicho atributo y los siguientes métodos adicionales:

 invertir(): Este método retornará el valor guardado en el atributo con sus cifras
invertidas. Por ejemplo si el valor guardado es 3915, retornará 5193
 parAntes(): Este método retornará el valor par próximo anterior al valor guardado.

 parPosterior(): Este método retornará el valor par próximo posterior al valor
guardado.
 primerDigito(): Este método retornará el primer dígito del valor guardado.
 ultimoDigito(): Este método retornará el último dígito del valor guardado.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear una instancia de la clase Pensador.
b) Probar todos sus métodos y mostrar por consola los resultados obtenidos.
 */
package guia.pkg2.ejercicio.pkg10;

/**
 *
 * @author Usuario
 */
public class Guia2Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Pensador valor1=new Pensador(310);
        System.out.println("el numero invertido es: " + valor1.invertir() );
        System.out.println("par anterior" + valor1.parAntes() );
        System.out.println("par posterior" + valor1.parPosterior()  );
        System.out.println("el primer digito es: " + valor1.primerDigito() );
        System.out.println("el ultimo digito es: " + valor1.ultimoDigito() );
    }
    
}
