package FibonacciFacil;

/* O programa lê um número inteiro N e apresenta os N primeiros números da série de Fibonacci.
*  A entrada é um valor inteiro (0<N<46).
*  A saída é a série até N, impresso em linha*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        System.out.print("Digite um número entre 0 e 46 para conhecer a série de Fibonacci: ");
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        int proximo, anterior = 0, atual = 1;
        System.out.printf("A série de Fibonacci até %d: ",N);
        for (int i = 1; i <= N; i++) {
            if (i == N) {
                System.out.println(anterior);
            }else {
                System.out.print(anterior + " ");
                proximo = anterior + atual;
                anterior = atual;
                atual =  proximo;
            }
        }
    }
}
