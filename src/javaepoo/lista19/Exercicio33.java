/**
 * Criar um vetor A com 10 elementos inteiros. Escreva um programa que
 * imprima cada elemento do vetor A e uma mensagem indicando se o
 * respectivo elemento é um número primo ou não.
 */


package javaepoo.lista19;
import java.util.Scanner;
public class Exercicio33 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];

        for(int i = 0; i < A.length; i++){
            System.out.print("Digite o " + (i+1) + "° elemento: ");
            A[i] = scanner.nextInt();
        }

        for(int i = 0; i < A.length; i++){
            int divisoresDeAPosicaoI = 0;
            for(int j = 1; j <= A[i]; j++ ) {
                if (A[i] % j == 0) {
                    divisoresDeAPosicaoI++;
                }
            }
            if (divisoresDeAPosicaoI == 2){
                System.out.println("PRIMO!!!");
            }else{
                System.out.println("NÃO PRIMO!!!");
            }
        }
        scanner.close();
    }

}
