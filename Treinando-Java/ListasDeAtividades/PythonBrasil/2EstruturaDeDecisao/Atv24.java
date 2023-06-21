/*24. Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.
 * O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
 * 
 * a. par ou ímpar;
 * 
 * b. positivo ou negativo;
 * 
 * c. inteiro ou decimal. 
*/
import java.util.Scanner;
public class Atv24 {
    public static void main(String[]args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Informe dois números.\n\nInforme o primeiro: ");
        float num1 = read.nextFloat();
        System.out.print("\n\nInforme o segundo: ");
        float num2 = read.nextFloat();
        System.out.println("Qual operação matemática você deseja fazer? (Responda como: +,-,*,/)");
        char res = read.next().charAt(0);
        read.close();
        float resposta = 0;
       
        if ( res == '+' ) {
            resposta = num1 + num2;
        }
        else if ( res == '-' ) {
            resposta = num1 - num2;

        }
        else if ( res == '*' ) {
            resposta = num1 * num2;

        }
        else if (res == '/') {
            resposta = num1 / num2;
        }
        System.out.println("A resposta é: "+resposta);

        if ( resposta % 2 == 0){
            System.out.println("O número "+resposta+" é par.");
        }
        else{
            System.out.println("O número "+resposta+" é impar.");
        }

        if ( resposta >= 0 ){
            System.out.println("O número "+resposta+" é positivo.");
        }else{
            System.out.println("O número "+resposta+" é negativo.");
        }
        if (Math.round(resposta) == resposta) {
            System.out.println("O número "+resposta+" é inteiro.");
        }
        else{
            System.out.println("O número "+resposta+" é decimal.");
        }
    }
}