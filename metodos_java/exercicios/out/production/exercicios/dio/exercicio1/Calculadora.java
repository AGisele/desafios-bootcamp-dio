package dio.exercicio1;

/* Calculadora tem como entrada dois valores, executa as operações matemáticas básicas e imprime os seus resultados */
public class Calculadora {

    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;

        System.out.printf("A soma de %.2f mais %.2f é igual a %.2f%n", numero1, numero2, resultado);
    }

    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;

        System.out.printf("A subtração de %.2f menos %.2f é igual a %.2f%n", numero1, numero2, resultado);
    }

    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;

        System.out.printf("A multiplicação de %.2f vezes %.2f é igual a %.2f%n", numero1, numero2, resultado);
    }

    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;

        System.out.printf("A razão entre o %.2f e o %.2f é igual a %.2f%n", numero1, numero2, resultado);
    }
}
