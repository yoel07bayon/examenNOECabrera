/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MezNCB4 {
    public static void Ejer4() {
        int[] arreglo={1,10,9,8,11,7,6,12,2,3,4,5};
          int dato;
          boolean fals= false;
          Scanner leer=new Scanner(System.in);
          System.out.println("DIJITE EL MES A BUSSCAR");
          dato =leer.nextInt();
          int i=0;
          while(i<12 && fals == false){
              if(arreglo [i] == dato){
                  fals= true;
              }
              i++;
          }
          
          if (fals== false){
              System.out.println("EL MES NO SE ENCUENTRA EN EL ARREGLO");
          }
          else{
              System.out.println("El número ha sido encontrado en la posición "+(i-1));
          }
        
    }
    
}
