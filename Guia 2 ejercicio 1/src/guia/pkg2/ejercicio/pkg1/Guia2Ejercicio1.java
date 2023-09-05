/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2.ejercicio.pkg1;

/**
 *
 * @author Usuario
 */
public class Guia2Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numero nume=new Numero(1459);
        
        if(nume.esPar()){
            System.out.println("es par");
        
        }else{
            System.out.println("es impar");
        
        }
        if(nume.esPositivo()){
            System.out.println("es positivo");
        
        }else{
            System.out.println("no es positivo");
        
        }
        if(nume.esMultiplo(3)){
            System.out.println("es multiplo de 3 ");
        
        }else{
            System.out.println("no es multiplo de 3");
        }
            
    }
    
}
