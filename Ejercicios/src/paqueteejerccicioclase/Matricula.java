
package paqueteejerccicioclase;

import java.util.Scanner;


public class Matricula {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String ciudad;
        String estadoCivil;
        int edad;
        double costomatricula = 1200;
        double costofinaldematricula;
        double descuento = 0;
        double impuesto;
        
        System.out.println("ingrese su ciudad de nacimiento");
        ciudad = sc.nextLine();
        
        System.out.println("Ingrese su estado civil ");
        estadoCivil = sc.nextLine();
        
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        
        if (ciudad.equals("Loja")|| ciudad.equals("Zamora")){
            //descuento
            descuento = (20*costomatricula) /100;
            costofinaldematricula = costomatricula - descuento ;
        }
         if ((edad >= 17) &&(edad<20)){
             descuento = descuento +(10*costomatricula)/100;
        }
        if (estadoCivil.equals("casado")){
             descuento = descuento +(5*costomatricula)/100;
        }
        impuesto = (2*costomatricula)/100;
        
        costofinaldematricula=costomatricula - descuento + impuesto;
        
        System.out.printf("el costo total de su matricual es de %.2f ",costofinaldematricula);
    }
}

