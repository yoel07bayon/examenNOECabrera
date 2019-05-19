/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import examen.UsoQuickSortNCB7;
import examen.UsoQuickSortNCB7;
import examen.UsoQuickSortNCB7;
import examen.UsoQuickSortNCB7;

/**
 *
 * @author JHOVY
 */
public class RecursividadNCB7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        UsoQuickSortNCB7 o = new UsoQuickSortNCB7();
		int vector[]={56,-7,0,65,12,20,9,33};
		o.ordenamientoQuickSort(vector, 0 ,vector.length-1);
		
		for(int i =0; i<vector.length; i++){
			System.out.print(vector[i]+ " ");
		}
	}
        
    }