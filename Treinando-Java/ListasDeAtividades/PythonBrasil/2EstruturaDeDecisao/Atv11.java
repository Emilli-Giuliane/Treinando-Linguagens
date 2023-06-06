//11.As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
//Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
//salários até R$ 280,00 (incluindo) : aumento de 20%
//salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//salários de R$ 1500,00 em diante : aumento de 5%

//Após o aumento ser realizado, informe na tela:
//o salário antes do reajuste;
//o percentual de aumento aplicado;
//o valor do aumento;
//o novo salário, após o aumento.
import java.util.Scanner;
public class Atv11{
    public static void main(String[]args){
        System.out.print("Digite seu salário >>> ");
        Scanner read = new Scanner(System.in);
        double salario = read.nextDouble();
        read.close();
        
        double reajuste, novoAumento;
        String aumento;
        if(salario <= 280.00){
            aumento = "20%";
            novoAumento = (salario * 0.2);
            reajuste = salario + novoAumento;
        }else if(salario > 280.00 && salario <= 700.00){
            aumento = "15%";
            novoAumento = (salario * 0.15);
            reajuste = salario + novoAumento;
        }else if(salario > 700.00 && salario <= 1500.00){
            aumento = "10%";
            novoAumento = (salario * 0.1);
            reajuste = salario + novoAumento;
        }else{
            aumento = "5%";
            novoAumento = (salario * 0.05);
            reajuste = salario + novoAumento;
        }

        System.out.println("O salario antes do reajuste era de R$"+salario+".");
        System.out.println("O aumento aplicado foi de "+aumento+".");
        System.out.println("O valor do aumento foi de "+novoAumento+".");
        System.out.println("O novo salário é: R$"+reajuste+".");

    }
}