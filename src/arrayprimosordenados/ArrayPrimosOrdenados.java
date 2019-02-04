/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprimosordenados;
import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class ArrayPrimosOrdenados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 10;
        int[] numeros = new int[cantidad];
        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        

        for (int j = 0; j < numeros.length-1; j++) {
                
                
                //Compruebo si el numero actual no es primo y el siguiente si lo es
                if (esPrimo(numeros[j]) == false && esPrimo(numeros[j+1]) == true) {
                    //Si se cumple lo de arriba, cambiamos sus posiciones y reiniciamos el bucle
                    int aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                    j = -1;
                 }

            
        }
        for (int k = 0; k < cantidad; k++) {
                   System.out.print(" " + numeros[k]);
               }System.out.println();
    }

    public static boolean esPrimo(int i) {
        int factores = 0;
        int j = 1;
        if (i == 1) return true;
        while (j <= i) {
            if (i % j == 0) {
                factores++;
            }
            j++;
        }
        return (factores == 2);
    }

}
