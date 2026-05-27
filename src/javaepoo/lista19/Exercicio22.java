/**
 * Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
 * 0 e 1. Pede-se para implementar um programa que determine o percentual de
 * números 0's e 1's existentes no vetor A.
 */

package javaepoo.lista19;

public class Exercicio22 {

    public static void main (String[] args) {

        int[] vetor = new int[10];
        int quantidadeDeZeros = 0;
        int quantidadeDeUns = 0;

        for(int i = 0; i < vetor.length; i++){
            int daVez = (int) (Math.random() * 2);
            vetor[i] = daVez;
            if (daVez == 0)
                quantidadeDeZeros++;
            else
                quantidadeDeUns++;
        }

        int porcentagemDeZeros = (int) ((quantidadeDeZeros * 0.1) * 100);
        int porcentagemDeUns = (int) ((quantidadeDeUns * 0.1) * 100);

        System.out.println("Porcentagem de Zeros: " + porcentagemDeZeros);
        System.out.println("Porcentagem de Uns: " + porcentagemDeUns);
    /*

        int num = (int) (Math.random() * 2);
        System.out.println(num);

        Math.random() gera um double entre 0.0 (inclusive) e 1.0 (exclusivo).
        Multiplicando por 2, o resultado fica entre 0.0 e 2.0 (exclusivo).
        O cast (int) descarta a parte decimal:
        valores entre 0.0 e 0.999... viram 0
        valores entre 1.0 e 1.999... viram 1

        Assim, numero será sempre 0 ou 1, com aproximadamente 50% de chance para cada valor.
    */
    }


}
