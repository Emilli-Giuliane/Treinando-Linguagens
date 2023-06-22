/*Uma fruteira está vendendo frutas com a seguinte tabela       * de preços:
Até 5 Kg           Acima de 5 Kg
Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg
 * 
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
*/
import java.util.Scanner;
public class Atv27 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Insira a quantidade (em Kg) de morangos: ");
        double pesoMorango = read.nextDouble();
        System.out.println("Insira a quantidade (em kg) de maçãs: ");
        double pesoMaca = read.nextDouble();
        read.close();
        double precoMorango = 0;
        double precoMaca = 0; 
        double pesoTotal = 0;
        double precoTotal = 0; 
        
        if (pesoMorango <= 5) { 
            precoMorango = 2.5 * pesoMorango;
        } else if (pesoMorango > 5) {
            precoMorango = 2.2 * pesoMorango;
        }
        if (pesoMaca <= 5) {
            precoMaca = 1.8 * pesoMaca;
        } else if (pesoMaca > 5) {
            precoMaca = 1.5 * pesoMaca;
        }
        pesoTotal = pesoMorango + pesoMaca;
        precoTotal = precoMaca + precoMorango;
        if (pesoTotal > 8 || precoTotal > 25) {
            precoTotal = precoTotal * 0.9;
        }
        System.out.printf("Valor a pagar: R$%.2f\n" , precoTotal);
    }
}