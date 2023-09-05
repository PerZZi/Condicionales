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


public class Fecha {
    private String dia;
    private String mes;
    private int año;

    public Fecha(String dia, String mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public boolean esBisiesto(){
        return año%4==0 && año%100!=0 || año%400==0;
    }
    
    public static int calcularAño(Fecha f1,Fecha f2){
        int diferencia=0;
        return diferencia= Math.abs(f1.año-f2.año);
    }
            
}
