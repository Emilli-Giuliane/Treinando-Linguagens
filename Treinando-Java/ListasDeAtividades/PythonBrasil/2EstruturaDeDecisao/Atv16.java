/*Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. 
 * O programa deverá pedir os valores de a, b e c e fazer as consistências,
 * informando ao usuário nas seguintes situações:
 * 
 * a.Se o usuário informar o valor de A igual a zero
 *  a equação não é do segundo grau e o programa não deve fazer pedir os demais valores,
 *  sendo encerrado;
 *
 * b.Se o delta calculado for negativo, a equação não possui raizes reais. 
 * Informe ao usuário e encerre o programa;
 * 
 * c.Se o delta calculado for igual a zero a equação possui apenas uma raiz real; 
 * informe-a ao usuário;
 *  
 * d.Se o delta for positivo, a equação possui duas raiz reais; 
 * informe-as ao usuário;
 */
import java.util.Scanner;
public class Atv16{
    public static void main(String[]args){
        System.out.print(">>> Calculador de raizes da equação do segundo grau >>>\n\nInforme o valor de \"a\": ");
        Scanner read = new Scanner(System.in);
        double a = read.nextDouble();
        System.out.println("Informe o valor de \"b\": ");
        double b = read.nextDouble();
        System.out.println("Informe o valor de \"c\": ");
        double c = read.nextDouble();
        double delta = b*b - 4 * a * c;
        

        if(a == 0){
            System.out.println("Valor de \"a\" inválido. \"a\" não pode ser igual a zero pois não seria uma equação do segundo grau.\n\nPrograma encerrado.");
            System.exit(0);
        }if(delta < 0){
            System.out.println("O valor de Delta calculado usando as informações fornecidas resultou em um número negativo, por tanto o valor de delta não tem raizes reais.\n\nPrograma encerrado.");
            System.exit(0);
        }
        if(delta == 0){
            System.out.println("O resultado de Delta é igual a 0, por tanto a equação possui apenas uma raiz real.");
            double x = (-b)/2*a;
            System.out.println("O resultado de \"x\" nessa equação é: \"x = "+ x +"\".");
        }if(delta > 0){
            System.out.println("O resultado de Delta é um número positivo, por tanto a equação possui duas raizes.");
            double x1 = ((-b) + Math.sqrt(delta))/(2*a);
            double x2 = ((-b) - Math.sqrt(delta))/(2*a);
            System.out.println("O valor de \"x¹\" é: \"x¹ = "+ x1 + "\".\nO valor de \"x²\" é: \"x² = "+ x2 +"\".");
        }read.close();
    }
}