/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JHOVY
 */
public class BusquedaBinariaNCB6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = { 1, 8, 34, 67, 9, 6, 78, 12, 56, 41, 90 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
                int n1, n2, n3;
                Scanner leer=new Scanner(System.in);
                System.out.println("ingrese el primer numero a abuscar:");
                n1 =leer.nextInt();
                System.out.println("Se encuentra en el puesto :");
		System.out.println(busca(array, n1));
                n2 =leer.nextInt();
		System.out.println(busca(array, n2));
                n3 =leer.nextInt();
		System.out.println(busca(array, n3));
                 
	}
	private static int busca(int[] array, int chave) {
		return buscaBinariaRecursiva(array, 0, array.length - 1, chave);
	}
	private static int buscaBinariaRecursiva(int[] array, int menor, int maior,
			int chave) {
		int media = (maior + menor) / 2;
		int valorMeio = array[media];

		if (menor > maior)
			return -1;
		else if(valorMeio == chave) 
			return media;
		else if (valorMeio < chave)
			return buscaBinariaRecursiva(array, media+1, maior, chave);
		else
			return buscaBinariaRecursiva(array, menor, media-1, chave);
	}
    }
