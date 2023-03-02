package PositivoMedia;

/* O programa lê 6 valores inseridos pelo usuário, mostra quantos desses foram positivos e a sua média.
    O dado de entrada pode ser do tipo inteiro ou flutuante.
    A saída imprime a quantidade de valores positivos, e posteriormente, a média.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x,soma=0;

        System.out.print("Insira 6 números");
        for (int i=0; i<6; i++) {
            x = leitor.nextDouble();

            if(x>0){
                cont++;
                soma= x+soma;
            }
        }

        media = soma/cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}
