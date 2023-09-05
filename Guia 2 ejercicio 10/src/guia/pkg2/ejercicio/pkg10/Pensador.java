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
public class Pensador {
    private int almacena;

    public Pensador(int almacena) {
        this.almacena = almacena;
    }

    public int getAlmacena() {
        return almacena;
    }

    public void setAlmacena(int almacena) {
        this.almacena = almacena;
    }
    public int invertir(){
        int aux=this.almacena;
        int resto=0;
        int invertido=0;
        while(aux>0){
            resto=aux%10;
            invertido=invertido*10+resto;
            aux/=10;
            
        
        }
        return invertido;
    }
    
    public int parAntes(){
        if(almacena%2==0){
           return almacena-2;
        }else{
            return almacena-1;
        }
    }
    public int parPosterior(){
        if(almacena%2==0){
            return almacena+2;
        }else{
            return almacena+1;
        }
    }
    
    public int primerDigito(){
        int aux=almacena;
        
        while(aux>10){
            aux=aux/10;
            
        }
        return aux;
        ///   public String primerDigito(){
//     String numCadena= Integer.toString(this.valor);
//     char digito = numCadena.charAt(0);
//     return String.valueOf(digito);}
        
    }
    public int ultimoDigito(){
        int aux=almacena;
        return aux%10;
    }
}
