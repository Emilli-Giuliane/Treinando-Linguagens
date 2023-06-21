/*19. Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
 * Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
 * 
 * ° 326 = 3 centenas, 2 dezenas e 6 unidades
 * ° 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
 */
import java.util.Scanner;
public class Atv19 {
    public static void main(String[]args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Informe um número de três dígitos: ");
        int n = read.nextInt();
        read.close();
        int unidade = (n%100)%10;
        int dezena = (n/10)%10;
        int centena = (n/100);

        if(n > 999){
            System.out.println("O programa não consegue ler números maiores que 999. Por favor, tente um número menor que 1.000.");
            System.exit(0);
        }
        else{
        System.out.println("Esse número tem: "+unidade+" unidades, "+dezena+" dezenas e "+centena+" centenas");
        }
        }
    }
