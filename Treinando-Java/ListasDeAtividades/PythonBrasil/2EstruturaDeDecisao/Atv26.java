/*Um posto está vendendo combustíveis com a seguinte tabela de descontos:
* a. Álcool:
 * b. até 20 litros, desconto de 3% por litro
 * c. acima de 20 litros, desconto de 5% por litro
 * d. Gasolina:
 * e. até 20 litros, desconto de 4% por litro
 * f. acima de 20 litros, desconto de 6% por litro 
 * Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
*/

import java.util.Scanner;
public class Atv26 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Informe o tipo de combustível como \"a (álcool) e g (gasolina).");
        char combs;
        combs = read.next().charAt(0);
        System.out.println("Informe a quantidade de litros vendidos: ");
        double litroVendido = read.nextDouble();
        double preco = 0;
        double pago = 0;
        read.close();
        double valorPagar = 0;
        double precoL = 0;
        double valorPago = 0;
        if (combs == 'a') {
            if (litroVendido <= 20) {
                preco = litroVendido*1.843;
            }
            if (litroVendido > 20) {
                valorPagar = (litroVendido - 20) * 1.805;
                precoL = 36.86;
            }
            valorPago = valorPagar + precoL;
        }
        if (combs == 'g') {
            if (litroVendido <= 20) {
                precoL = litroVendido * 2.4;
            }
            if (litroVendido > 20) {
                valorPagar = (litroVendido - 20) * 2.35;
                precoL= 48;
            }
            valorPago = valorPagar + precoL;
        }
        System.out.println("O valor que deve ser pago será de: R$" +pago);
    }
}