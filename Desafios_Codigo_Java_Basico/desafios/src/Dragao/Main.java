package Dragao;

/* O programa verifica o poder de luta do dragão */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int casos, poderDeLuta;

        Scanner ler = new Scanner(System.in);

        System.out.print("Número de casos: ");
        casos = ler.nextInt();


        for(int i = 0; i < casos; i++){
            System.out.print("Qual o nível de energia? ");
            poderDeLuta = ler.nextInt();

            if( poderDeLuta<=8000){
                System.out.println("Inseto!");
            } else {
                System.out.println("Mais de 8000!");
            }
        }
    }
}