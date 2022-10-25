/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import java.util.Scanner;
/**
 *
 * @author Danna Casco
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //entrada de mes y año
    System.out.print("Ingrese número de mes: ");
    int mes = sc.nextInt();
    System.out.print("Ingrese el año: ");
    int año = sc.nextInt();
        //para crear formula de año bisiesto 
    int mes_febrero;
        //mese con 31 días 
    switch (mes){
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println("Tiene 31 dias");
        break;
            //mese con 30 días
      case 4:
      case 6:
      case 9:
      case 11:
        System.out.println("Tiene 30 dias");
        break;
            //cáculo de año bisiesto
      case 2:
        mes_febrero = año % 4;
        if (mes_febrero == 0){
          System.out.println("febrero tiene 29 días");
        }else{
          System.out.println("feberero tiene 28 días");
        }
        break;
            //ingreso incorrecto de entrada
      default:
        System.out.println("Introducir datos correctos");

    }
    }
    
}
