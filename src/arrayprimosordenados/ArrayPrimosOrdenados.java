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
        int[] numeros = new int[10];
        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (esPrimo(numeros[i]) == true && esPrimo(numeros[j]) == false) {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }

            }
        }
        for (int k = 0; k < 10; k++) {
                   System.out.print(" " + numeros[k]);
               }System.out.println();
    }

    public static boolean esPrimo(int i) {
        int factores = 0;
        int j = 1;

        while (j <= i) {
            if (i % j == 0) {
                factores++;
            }
            j++;
        }
        return (factores == 2);
    }
}
