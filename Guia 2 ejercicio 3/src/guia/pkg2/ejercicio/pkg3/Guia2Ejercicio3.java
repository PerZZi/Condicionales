/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2.ejercicio.pkg3;

/**
 *
 * @author Usuario
 */
public class Guia2Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo=new Circulo(5.75, 3.14) ;
        
        System.out.println("Su area es de: " + circulo.calcularArea() );
        System.out.println("Su perimetro es de: " + circulo.calcularPerimetro() );
    
    }
   
    
    
}
