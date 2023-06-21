/*20. Faça um Programa para leitura de três notas parciais de um aluno.
 * O programa deve calcular a média alcançada por aluno e presentar:
 * a. A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
 * b. A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
 * c. A mensagem "Aprovado com Distinção", se a média for igual a 10.
 */
import java.util.Scanner;
public class Atv20 {
    public static void main(String[]args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Informe o valor de sua primeira nota: ");
        float n1 = read.nextFloat();
        System.out.println("Informe o valor de sua segunda nota: ");
        float n2 = read.nextFloat();
        System.out.println("Informe o valor de sua terceira nota: ");
        float n3 = read.nextFloat();
        read.close();
        float media = (n1 + n2 + n3) / 3;

        if(media >= 7 && media < 10 ) {
            System.out.println("Aprovado");
        }
        if(media < 7) {
            System.out.println("Reprovado");
        }
        if(media == 10) {
            System.out.println("Aprovado com Distinção");
        }
    }
}