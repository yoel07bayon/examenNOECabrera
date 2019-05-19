package examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorio
 */
public class TecladoNCB2 {

    BufferedReader br = new BufferedReader(new 
    InputStreamReader(System.in));    
    
    public int leer(int dato, String texto){          
        try {
            System.out.println(texto);
            dato=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }
    
    public String leer(String dato, String texto){       
        try {
            System.out.println(texto);
            dato=br.readLine();
        } catch (IOException e) { 
            System.err.println(e.getMessage());
        }
        return dato;
    }
    public char leer(char dato, String texto){
          try {
            System.out.println(texto);
            dato=br.readLine().charAt(0);
        } catch (IOException e) { 
            System.err.println(e.getMessage());
        }
        return dato;
    }
     public boolean leer(boolean dato, String texto){       
        try {
            System.out.println(texto);
             dato=Boolean.parseBoolean(br.readLine());
        } catch (IOException e) { 
            System.err.println(e.getMessage());
        }
        return dato;
    }
    public double leer(double dato, String texto){         
        try {
            System.out.println(texto);
            dato=Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }
    public static void ejer2(){
        Scanner leer=new Scanner(System.in);
        int resul=1;
        System.out.println("Ingrese el primer numero");
        int n1=leer.nextInt();
        System.out.println("Ingrese la operacion que desea relizar: ");
        String t=leer.next();
        System.out.println("Ingrese el segundo numero");
        int n2=leer.nextInt();
        if("+".equals(t)){
            resul=n1+n2;
        }else if("-".equals(t)){
             resul=n1-n2;
        }else if("x".equals(t)){
             resul=n1*n2;
        }else if("/".equals(t)){
             resul=n1/n2;
        }
        System.out.println("El resultado de "+n1+" "+t+" "+n2+" = "+resul);
    }
    public static void main(String[] args) {
    
        ejer2();
        
    }
}