package SomaHNTermos;
/* Neste desafio, o programa calcula o valor de H com N termos.
*  O usuário da como entrada um número positivo inteiro e na saída será impresso a soma dos termos */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double h=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            h=h+(double)1/i;
        }
        System.out.println("A soma dos N termos é: "+Math.round(h));
    }
}

