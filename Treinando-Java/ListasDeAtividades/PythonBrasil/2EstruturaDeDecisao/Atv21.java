/*21. Faça um Programa para um caixa eletrônico.
 * O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas de cada valor serão fornecidas.
 * As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais.
 * O programa não deve se preocupar com a quantidade de notas existentes na máquina.
 * 
 * a. Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
 * 
 * b. Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1. 
 * 
 * 
 * */
import java.util.Scanner;
public class Atv21 {
    public static void main(String[]args) {
        Scanner read = new Scanner(System.in);
        System.out.println("< < Programa de caixa eletrónico > >\n\nAs notas disponíveis são as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais.\n\nQual o valor do saque?: ");
        int saque = read.nextInt();
        System.out.println("");
        int nota1 = 0, nota5 = 0, nota10 = 0, nota50 = 0, nota100 = 0;
        read.close();

        if ( saque >= 10 && saque <= 600 ) {
            if ( saque >= 100 ) {
                nota100 = saque / 100;
                saque =  saque % 100;
            }
            if ( saque >= 50 ) {
                nota50 = saque / 50;
                saque = saque % 50;
            }
            if ( saque >= 10 ) {
                nota10 = saque / 10;
                saque = saque % 10;
            }
            if ( saque >= 5 ) {
                nota5 = saque / 5;
                saque = saque % 5;
            }
            if ( saque >= 1 ) {
                nota1 = saque / 1;
                saque = saque % 1;
            }
            System.out.println("O saque gerará as seguintes quantidades de notas:\n"+nota100+" notas de R$100.");
            System.out.println(nota50+" notas de R$50.");
            System.out.println(nota10+" notas de R$10.");
            System.out.println(nota5+" notas de R$5.");
            System.out.println(nota1+" notas de R$1.");
        }
        else{
            System.out.println("O saque não pode ser efetuado pois o valor do seu saque é maior que o máximo ou menor que o mínimo aceitos pelo banco.");
        }
    }
}