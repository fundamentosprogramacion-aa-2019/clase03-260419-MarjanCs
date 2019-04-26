
package paquetecinco;
import paquetedos.MiMensaje;

import java.util.Scanner;

public class CondicionalDoble {
    public static void main(String[] args) {
        
        String mensaje1 = MiMensaje.mensajeUno;
        String mensaje2 = MiMensaje.mensajeDos;
                
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota");
        int calificacion = sc.nextInt();
        
        if (calificacion >=80){
        System.out.printf(" El sujeto esta %s con %d puntos \n",mensaje1 , calificacion);
        }else{
            System.out.printf("El sujeto esta %s con %d puntos \n",mensaje2 , calificacion);
        }
    }
}
