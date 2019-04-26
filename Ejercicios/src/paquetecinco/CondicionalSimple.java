
package paquetecinco;
import java.util.Scanner;
import paquetedos.MiMensaje;


public class CondicionalSimple {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String Anuncio = MiMensaje.mensajeUno;
        String Anuncio2 = MiMensaje.mensajeDos;
        
        System.out.println("Ingrese la primera calificacion ");
        
        int calificacion = sc.nextInt();
        
         if (calificacion >=85){
            System.out.printf("%s con %d puntos \n",Anuncio , calificacion);
         }
         
        System.out.println("Ingrese la segunda calificacion ");
        
        int calificacion2 = sc.nextInt();
        
         if (calificacion2 < 85){
             System.out.printf("%s con %d puntos \n",Anuncio2 , calificacion2);
         }
    }
}
