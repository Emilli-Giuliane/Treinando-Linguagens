/*25. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
 * a. "Telefonou para a vítima?"
 * b. "Esteve no local do crime?"
 * c. "Mora perto da vítima?"
 * d. "Devia para a vítima?"
 * e. "Já trabalhou com a vítima?"
 * O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
 * entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
 * Caso contrário, ele será classificado como "Inocente".
 * 
*/
import java.util.Scanner;
public class Atv25 {
    public static void main(String[]args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Faremos algumas perguntas para você sobre o crime. Responda \"Sim(s) ou Não(n)\"conforme você identifica com seu caso.\n\nPrimeira pergunta:\nTelefonou para a vítima?  ");
        char resp1 = read.next().charAt(0);
        System.out.print("\n\nSegunda pergunta:\nEsteve no local do crime?  ");
        char resp2 = read.next().charAt(0);
        System.out.print("\n\nTerceira pergunta:\nMora perto da vítima?  ");
        char resp3 = read.next().charAt(0);
        System.out.print("\n\nQuarta pergunta:\nDevia para a vítima?  ");
        char resp4 = read.next().charAt(0);
        System.out.print("\n\nQuinta pergunta:\nJá trabalhou com a vítima?  ");
        char resp5 = read.next().charAt(0);
        int totalResp = 0;
        read.close();
        String classificacao = "";

        if (resp1 == 's'){
            totalResp += 1;
        }
        if (resp2 == 's') {
            totalResp += 1;
        }
        if (resp3 == 's') {
            totalResp += 1;
        }
        if (resp4 == 's') {
            totalResp += 1;
        }
        if (resp5 == 's') {
            totalResp += 1;
        }
        if (totalResp == 5) {
            classificacao = "O assassino";
        }
        else if (totalResp == 4 || totalResp == 3) {
            classificacao = "O cúmplice";
        }
        else if (totalResp == 2) {
            classificacao = "Um suspeito";
        }
        else{
            classificacao = "Inocente";
        }
        System.out.println("Sua classificação é de "+classificacao);
    }
}