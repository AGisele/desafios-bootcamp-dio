package dio.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Calculadora
        System.out.println("Exercício calculadora");
        System.out.println("Insira dois valores");
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();

        Calculadora.soma(numero1, numero2);
        Calculadora.subtracao(numero1, numero2);
        Calculadora.multiplicacao(numero1, numero2);
        Calculadora.divisao(numero1, numero2);

        System.out.println("-------------'");
        //Mensagem
        System.out.println("Exercício mensagem");
        System.out.println("Insira a hora:");
        int hora = sc.nextInt();

        Mensagem.obterMensagem(hora);

        System.out.println("-------------'");
        //Empréstimo
        System.out.println("Exercício empréstimo");
        System.out.println("Insira o valor:");
        double valor = sc.nextDouble();

        System.out.println("Prefere 2 ou 3 parcelas?:");
        int parcelas = sc.nextInt();
        Emprestimo.calcular(valor, parcelas);
    }
}
