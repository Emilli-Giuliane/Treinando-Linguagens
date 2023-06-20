//13. Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.)
//, se digitar outro valor deve aparecer valor inválido.
import java.util.Scanner;
public class Atv13ComVetorEWhile{
    public static void main(String[]args){
        System.out.println("Insira um número, o programa vai exibir o dia correspondente da semana para você: ");
        Scanner read = new Scanner(System.in);
        int numero = read.nextInt();
     

        String []dia = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sábado"};

        while(numero <= 0 || numero >= 8){
            System.out.println("Número inválido. Digite um número entre 1 e 7: ");
            numero = read.nextInt();
        }if(numero == 1){
            System.out.println("O número informado corresponde a "+dia[0]);
        }else if(numero == 2){
            System.out.println("O número informado corresponde a "+dia[1]);
        }else if(numero == 3){
            System.out.println("O número informado corresponde a "+dia[2]);
        }else if(numero == 4){
            System.out.println("O número informado corresponde a "+dia[3]);
        }else if(numero == 5){
            System.out.println("O número informado corresponde a "+dia[4]);
        }else if(numero == 6){
            System.out.println("O número informado corresponde a "+dia[5]);
        }else if(numero == 7){
            System.out.println("O número informado corresponde a "+dia[6]);
        }
    read.close();
    }
}

/*NotasDoMeuEuPassadoParaMeuEuFuturo: 
 *EuFiqueiUmas4Ou5HorasPesquisandoNoGoogleETentandoEntenderComoQueFazIssoFuncionar.
 *MasNãoMeArrependo.
 */