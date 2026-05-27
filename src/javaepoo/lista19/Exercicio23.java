/**
 * Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
 * que verifique se "todos" os elementos do vetor A são pares. Se pelo
 * menos um elemento do vetor não for par o processo de repetição para
 * percorrer os elementos do vetor deve ser encerrado, como sugestão:
 * utilize uma variável do tipo flag para atingir este propósito
 */

package javaepoo.lista19;
import java.util.Scanner;
public class Exercicio23 {

    public static void main(String[] args) {
        Scanner objetoScanner = new Scanner(System.in);
        //flag: serve como uma bandeira quando levantada confirma e quando abaixada nega
        boolean impar = false;
        int[] A = new int[10];

        for (int i = 0; i < A.length; i++){
            System.out.println("Digite o valo: " + i + " de A: ");
            A[i] = objetoScanner.nextInt();
        }

        for(int valor : A){
            if (valor % 2 != 0){
                impar = true;
                break;
            }
        }

        if(impar)
            System.out.println("Valor impar encontrado!!!");

        objetoScanner.close();
    }


}
