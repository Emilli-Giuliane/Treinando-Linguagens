/*17. Faça um Programa que peça um número correspondente a um determinado ano
 * e em seguida informe se este ano é ou não bissexto.
 */
import java.util.Scanner;
public class Atv17{
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);

        System.out.println("Informe o ano: ");
        int ano = read.nextInt();

        if(ano % 100 == 0 && !(ano % 400 == 0)){
            System.out.println("O ano \""+ano+"\" não é bissexto!");
        }else if(ano % 4 == 0 || ano % 400 == 0){
            System.out.print("O ano \""+ano+"\" é bissexto!");
        } 
    read.close();
    }
}