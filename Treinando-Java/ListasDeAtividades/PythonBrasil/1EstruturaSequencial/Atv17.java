//Faça um Programa para uma loja de tintas.
//O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
//Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//comprar apenas latas de 18 litros;
//comprar apenas galões de 3,6 litros;
//misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
import java.util.Scanner;
public class Atv17 {
    public static void main(String[]args){

        System.out.print("Informe o tamanho em metros quadrados da área a ser pintada >>> ");
        Scanner read = new Scanner(System.in);
        double area = read.nextDouble();
        read.close();
        double litros = area / 6 * 1.1;
        double lata = Math.ceil(litros / 18);
        double lataPreco = (lata * 80.00);

        double galao = Math.ceil(litros / 3.6);
        double galaoPreco = galao * 25.00;

        System.out.println("As quantidades de tinta a serem compradas e os respectivos preços em 2 situações para seu caso são:");
        System.out.println("Comprar apenas latas de 18 litros resulta em R$"+lataPreco);
        System.out.println("Comprar apenas galões de 3,6 litros resulta em R$"+galaoPreco);
        System.out.println("");

    }
}