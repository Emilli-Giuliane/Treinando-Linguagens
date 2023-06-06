//Faça um Programa que leia três números e mostre-os em ordem decrescente.
import java.util.Scanner;
public class Atv9{
    public static void main(String[]args){
        System.out.print("Informe três números: ");
        System.out.print("Primeiro número >>> ");
        Scanner read = new Scanner(System.in);
        int n1 = read.nextInt();
        System.out.print("Segundo número >>> ");
        int n2 = read.nextInt();
        System.out.print("Terceiro número >>> ");
        int n3 = read.nextInt();
        read.close();

        if(n1 >= n2 && n1 >= n3){
            if(n2 >= n3){
                System.out.print(" "+n1+" "+n2+" "+n3);
            }else{
                System.out.print(" "+n1+" "+n3+" "+n2);
            }
        }else if(n2 >= n1 && n2 >= n3){
            if(n1 >= n3){
                System.out.print(" "+n2+" "+n1+" "+n3);
            }else{
                System.out.print(" "+n2+" "+n3+" "+n1);
            }
        }else{
            if(n1 >= n2){
                System.out.print(" "+n3+" "+n1+" "+n2);
            }else{
                System.out.print(" "+n3+" "+n2+" "+n1);
            }
        }System.out.println();
    }
}