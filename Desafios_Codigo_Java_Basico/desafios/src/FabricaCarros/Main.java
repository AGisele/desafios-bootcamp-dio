package FabricaCarros;

/* O programa calcula o custo de um carro novo para o consumidor.
*   O valor de entrada são 3 números inteiros, o custo de fábrica, as porcentagens do distribuidor e os impostos.
*   A saída é valor final do preço de um carro novo para o consumidor.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int custoFabrica,porcentagemDistribuidor, percentualImpostos, distribuidor, valorImpostos, custoConsumidor;

        System.out.print("Insira o custo de fábrica:");
            custoFabrica = scan.nextInt();

        System.out.print("Insira a porcentagem do distribuidor:");
            porcentagemDistribuidor = scan.nextInt();

        System.out.print("Insira o percentual de impostos:");
            percentualImpostos = scan.nextInt();

        distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        valorImpostos = (custoFabrica * percentualImpostos) / 100;
        custoConsumidor= custoFabrica+distribuidor+valorImpostos;


        System.out.println("Valor final para o consumidor: R$ " +custoConsumidor);
    }
}
