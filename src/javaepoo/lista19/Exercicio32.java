/**
 * Criar um vetor A com 5 elementos inteiros. Escreva um programa que
 * imprima a tabuada de cada um dos elementos do vetor A
 */


package javaepoo.lista19;
import java.util.Scanner;
public class Exercicio32 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];

        for(int i = 0; i < A.length; i++){
            System.out.print("Digite o " + (i+1) + "° elemento: ");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < A.length; i++){
            for(int j = 0; j < 10; j++){
                System.out.println(A[i] + " * " + (j+1) + " = " + A[i] * (j+1));
            }
            System.out.println("");
        }

        scanner.close();
    }

}
