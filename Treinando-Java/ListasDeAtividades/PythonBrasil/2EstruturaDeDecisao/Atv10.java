//Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
import java.util.Scanner;
public class Atv10{
    public static void main(String[]args){
        System.out.print("Qual turno você estuda? (\"M\" para matutino/ \"V\" para vespertino/\"N\" para noturno) >>> ");
        Scanner read = new Scanner(System.in);
        char turno = read.next().charAt(0);
        read.close();

        if(turno == 'M' || turno == 'm'){
            System.out.print("Bom dia! ");
        }else if(turno == 'V'||turno == 'v'){
            System.out.print("Boa tarde! ");
        }else if(turno == 'N'||turno == 'n'){
            System.out.print("Boa noite! ");
        }else{
            System.out.print("Valor inválido! ");
        }
        
    }
}