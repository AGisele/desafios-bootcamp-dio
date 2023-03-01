package dio.exercicio1;

/* Empréstimo tem como entrada o valor e o número de parcelas, executa as cálculos e imprime o seu resultado */
public class Emprestimo {

    public static double getTaxaDuasParcelas(){
        return 0.3;
    }

    public static double getTaxaTresParcelas(){
        return 0.45;
    }
    public static void calcular (double valor, int parcelas){
        if (parcelas==2){
            double valorFinal= valor + (valor*getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " +valorFinal);
        } else if (parcelas==3) {
            double valorFinal= valor + (valor*getTaxaTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " +valorFinal);
        } else
            System.out.println("Quantidade de parcelas não aceita.");
    }
}
