
package guia.pkg2.ejercicio.pkg2;


public class Guia2Ejercicio2 {

   
    public static void main(String[] args) {
        Cuadrilatero cuadrilatero = new Cuadrilatero(70, 50);
        System.out.println("Su perímetro es de: "+cuadrilatero.calcularPerimetro());
        System.out.println("Su superficie es de: "+cuadrilatero.calcularArea());
        if(cuadrilatero.esUnCuadrado()){
            System.out.println("Es un cuadrado");
        } else {
            System.out.println("No es un cuadrado");
        }
        cuadrilatero.setAlto(70);
        if(cuadrilatero.esUnCuadrado()){
            System.out.println("Es un cuadrado");
        } else {
            System.out.println("No es un cuadrado");
        }
    }
}
    
        
    
    


