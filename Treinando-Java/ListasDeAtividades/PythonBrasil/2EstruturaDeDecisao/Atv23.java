/*23. Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
 * Dica: utilize uma função de arredondamento.
 */
import java.util.Scanner;
public class Atv23 {
    public static void main(String[]args) {
        Scanner read = new Scanner(System.in);
        System.out.println("< < Programa para provar se um número é par ou impar > >");
        System.out.println("Digite o número: ");
        double n = read.nextDouble();
        read.close();
        
        if ( Math.round(n) == n ) {
            System.out.println("Esse número é inteiro.");
        }
        else{
            System.out.println("Esse número é decimal.");
        }
    }
}