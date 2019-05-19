/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import examen.AutomovilesNCB1;
import examen.AutomovilesNCB1;
import examen.MezNCB4;
import examen.OrdenacioNCB3;
import examen.TecladoNCB2;
import java.util.Scanner;
public class MenuDeOpcionesNCB5 {
        public static void main(String[] args) {
        System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){
            case 1: AutomovilesNCB1.ejer1();break;
            case 2: TecladoNCB2.ejer2();break;
            case 3: OrdenacioNCB3.ejer3();break;
            case 4: MezNCB4.Ejer4();break;
            
          
            default: System.out.println("Opción Inválida!!");break;
            }  
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
        }
    }
    
}
