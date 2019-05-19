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
public class AutomovilesNCB1 {

    /**
     * @param args the command line arguments
     */

    public static void ejer1() {
        int autosx,inc=1;
        double precio1=1,precio2=1, precio3=1,Total=1;
        Scanner i=new Scanner(System.in);
      
        while(inc<=3){
            
            
            System.out.println("Itrodusca  la categoria (1,2,3): ");
            int cater=i.nextInt();
            System.out.println("Introdusca el precio de la categoria "+cater+" es: ");
            int cate1=i.nextInt();
            if(cater==1){
                precio1=cate1*0.10;
            }else if(cater==2){
                precio2=cate1*0.07;
            }else if(cater==3){
                precio3=cate1*0.05;
            }
            
          inc++; 
          Total=precio1+precio2+precio3;
        }
        System.out.println("El igb total: "+Total);
        System.out.println("El igb de la categoria 1: "+precio1);
        System.out.println("El igb de la categoria 2: "+precio2);
        System.out.println("El igb de la categoria 3: "+precio3);
        
    }
    public static void main(String[] args) { 
        ejer1();
        
        
        
    }
    }
    