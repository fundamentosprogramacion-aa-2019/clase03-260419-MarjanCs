package paquetecinco;
import paquetedos.MiMensaje2;

import java.util.Scanner;

public class CondicionalAnidado {

   public static void main(String[] args) {
        // documentacion
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la calificacion");
        
        int calificacion = sc.nextInt();
        String mensaje1 = MiMensaje2.anuncio1;
        String mensaje2 = MiMensaje2.anuncio2;
        String mensaje3 = MiMensaje2.anuncio3;
        String mensaje4 = MiMensaje2.anuncio4;
        String mensaje5 = MiMensaje2.anuncio5;


        if (calificacion >= 90) {
            System.out.printf("%s ( %s)  con %d con puntos ",mensaje1,mensaje2, 
                    calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("%s  (%s)  %d con puntos ",mensaje1,mensaje3, 
                    calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("%s (%s) %d con puntos",mensaje1,mensaje4, 
                    calificacion);

                } else {
                    System.out.printf("%s %d con puntos",mensaje5, 
                    calificacion);
                }
            }
        }
   }
}
