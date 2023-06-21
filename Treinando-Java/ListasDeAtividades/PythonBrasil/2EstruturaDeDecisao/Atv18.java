/*18.Faça um Programa que peça uma data no formato dd/mm/aaaa
 * e determine se a mesma é uma data válida.
*/
import java.util.Scanner;
public class Atv18{
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        System.out.println("Informe a data em formato \"dd/mm/aaaa\" e o programa vai avaliar se é uma data válida ou não.");
        System.out.println("Informe o dia: ");
        int dia = read.nextInt();
        System.out.println("Informe o mês: ");
        int mes = read.nextInt();
        System.out.println("Informe o ano: ");
        int ano = read.nextInt();
        read.close();
        
        if(mes == 2){
            if((ano % 4 == 0 || ano % 400 == 0 && ano % 100 == 0) && dia > 0 && dia < 30){
                if(dia > 0 && dia < 29){
                    System.out.println("Data válida!");
                }
            }else{
                if((ano % 4 != 0 || ano % 400 != 0 && ano % 100 == 0)){
                    if(dia > 0 && dia < 30){
                        System.out.println("Data válida!");
                    }
                }

            }
        }if((dia > 0 && dia < 32) && (mes > 0 && mes < 13)){
            if((mes == 1||mes == 3||mes== 5||mes== 7||mes == 8||mes == 10|| mes == 12) && dia > 0 && dia < 32){
                System.out.println("Data válida.");
            }if((mes == 4||mes == 6||mes == 9||mes == 11) && dia > 0 && dia < 31){
            System.out.println("Data válida!");
            }
        }else{
            System.out.println("Data inválida.");
                }
        }
    }
