/**
 *Números palíndromos são aqueles que escritos da direita para a
 * esquerda têm o mesmo valor quando escritos da esquerda para a
 * direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
 * programa que verifique se um dado vetor A de 10 elementos inteiros é
 * um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
 * último, se o segundo elemento do vetor é igual ao penúltimo e assim
 * por diante até verificar todos os elementos ou chegar a conclusão que
 * o vetor não é um palíndromo.
 */

package javaepoo.lista19;
import java.util.Scanner;
public class exercicio24 {

    public static void main (String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        Scanner objetoScanner = new Scanner(System.in);

        for (int i = 0; i < A.length; i++){
            System.out.println("Digite o " + i + "° elemento de A: ");
            A[i] = objetoScanner.nextInt();

        }

        for (int i = 0; i < A.length; i++){
            B[i] = A[(A.length - i) - 1];
        }

        int contador = 0;
        for(int a = 0; a < A.length; a++){
            if (A[a] == B[a]) {
                contador++;
            }
        }

        if (contador == 10)
            System.out.println("PALINDROMO!!!");
        else
            System.out.println("NÃO PALINDROMO!!!");

        objetoScanner.close();
    }

}
