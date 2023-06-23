/*O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
 *                      Até 5 Kg           Acima de 5 Kg
 * File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
 * Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
 * Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
 * Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.
*/

import java.util.Scanner;
public class Atv28 {
    public static void main(String[] args) {
        System.out.println("<<< Seja bem-vindo ao Hipermercado Tabajara! >>>");       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe qual carne voce quer (f para \"file duplo\", a para \"alcatra\" ou p para \"picanha\"): ");
        char carne = scanner.next().charAt(0); //não sei o pq mas não consigo usar o "String" pro meu Scanner.
        System.out.println("Informe a quantidade de carne: "); 
        double qntdCarne = scanner.nextDouble();
        System.out.println("Qual a forma de pagamento? (d para \"dinheiro\", c para \"cartao\" ou t para \"cartao_tabajara\"): ");
        char formaPag= scanner.next().charAt(0);
        double valorAPagar;
        scanner.close();
        
        int i = 0;
        double preco = 0;
        double disconto = 0;
        if(carne == 'f') {
            if (qntdCarne < 5 ){
                preco = qntdCarne * 4.9;
            } else if (qntdCarne > 5 ){
                preco = qntdCarne * 5.8;
            }}
         else if (carne == 'a'){
                if (qntdCarne < 5 ){
                preco = qntdCarne * 5.9;
            } else if (qntdCarne > 5 ){
                preco = qntdCarne * 6.8;
            }}
        else if (carne == 'p'){
            if (qntdCarne < 5 ){
                preco = qntdCarne*6.9;
            } else if (qntdCarne > 5 ){
                preco = qntdCarne*7.8;
            } else{
            System.out.println("Valor inválido!");
             System.exit(0);
        }}
        if (formaPag == 't') {
            disconto = preco * 0.05;
            i = 1;
        } //se cliente usou "t", então ele tem desconto. i recebe 1 como um auxilio para chamar o "if" mais fácil. Aprendi isso com os melhores, ehehe
        
        valorAPagar = preco - disconto;
        
        System.out.println("Cupom fiscal••••••\n\nTipi da carne: " + carne);
        System.out.println("Quantidade de carne comprada: " + qntdCarne);
        System.out.println("Preço total é de R$" + preco);
        System.out.println("Forma de pagamento: " + formaPag);
        if (i==1) {
            System.out.println("Usando o cartão Tabajara, seu desconto é de 5%. O valor do desconto total é de R$"+disconto);
        }
        System.out.println("Preço a pagar: R$"+valorAPagar+"\n\nO Hipermercado Tabajara agradeçe sua preferencia!••••••");
    }
}