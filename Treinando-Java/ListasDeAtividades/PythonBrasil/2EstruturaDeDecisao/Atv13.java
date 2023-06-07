//13. Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.)
//, se digitar outro valor deve aparecer valor inválido.
import java.util.Scanner;
public class Atv13{
    public static void main(String[]args){
        System.out.println("Insira um número, o programa vai exibir o dia correspondente da semana para você: ");
        Scanner read = new Scanner(System.in);
        int numero = read.nextInt();
        read.close();

        String dia;
        if(numero == 1){
            dia = "O dia é Segunda.";
        }else if(numero == 2){
            dia = "O dia é Terça.";
        }else if(numero == 3){
            dia = "O dia é Quarta.";
        }else if(numero == 4){
            dia = "O dia é Quinta.";
        }else if(numero == 5){
            dia = "O dia é Sexta.";
        }else if(numero == 6){
            dia = "O dia é Sábado.";
        }else if(numero == 7){
            dia = "O dia é Domingo.";
        }else{
            dia = "Valor inválido.";
        }

        System.out.println(dia);
        System.out.println("");
    }
}