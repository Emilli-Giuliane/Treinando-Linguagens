/*Uma fruteira está vendendo frutas com a seguinte tabela       
* de preços:Até 5 Kg           Acima de 5 Kg
Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg
 * 
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
*/
import java.util.Scanner;

public class Atv27 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      double kgMaca = 0,kgMorango = 0,preco = 0,precoPagar = 0,desconto;
      int respA,respB;
      System.out.println("Bem-Vindo! Qual sua preferencia de fruta para comprar em kg? Por favor, digite o número '1' para maçã e ou digite '2' para morango");
      respA = scanner.nextInt();
    System.out.println("Qual a quantidade em peso (kg) de sua preferência para a compra? ");
      respB = scanner.nextInt();
      scanner.close();

      if (respA == 1) {
        if (respB > 0 && respB <= 5) {
          kgMaca = 1.80;
          preco = kgMaca * respB;
        } else if (respB > 5) {
          kgMaca = 1.50;
          preco = kgMaca * respB;
        }
      } if (respA == 2) {
        if (respB > 0 && respB <= 5) {
          kgMorango = 2.50;
          preco = kgMorango * respB;
        } else if (respB > 5) {
          kgMorango = 2.20;
          preco = kgMorango * respB;
        } 
      } precoPagar = preco;
      
      if (precoPagar >= 25.00 || respB >= 8){
        desconto = (precoPagar * 0.1) * precoPagar;
        System.out.println("Você recebeu um desconto de 10%!!! O valor a pagar com o desconto é de: R$" + desconto);
      } else {
        System.out.println("O valor a pagar é de: R$" + precoPagar);
      }
    }
}//não curti o resultado então refiz do zero. Agora refeito acho que me agrada mais.