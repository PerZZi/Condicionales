
package guia.pkg2.ejercicio.pkg2;


public class Cuadrilatero {
    
    private int largo;
    private int alto;

    public Cuadrilatero(int largo, int alto) {
        this.largo = largo;
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
     public int calcularPerimetro(){
        return largo*2 + alto*2;
    }
    
    public int calcularArea(){
        return largo * alto;
    }
    
    public boolean esUnCuadrado(){
        return alto == largo;
    }
}
    

