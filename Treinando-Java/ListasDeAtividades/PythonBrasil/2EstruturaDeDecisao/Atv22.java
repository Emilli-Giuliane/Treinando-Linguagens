/*21. Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
 * Dica: utilize o operador módulo (resto da divisão).
 */
import java.util.Scanner;
public class Atv22 {
    public static void main(String[]args) {
        Scanner read = new Scanner(System.in);
        System.out.println("< < Programa para provar se um número é par ou impar > >");
        System.out.println("Digite o número: ");
        int n = read.nextInt();
        read.close();

        if ( n % 2 == 0 ) {
            System.out.println("Esse número é par.");
        }
        else {
            System.out.println("Esse número é impar.");

        }

    }
}