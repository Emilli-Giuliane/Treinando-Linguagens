//Faça um programa para o cálculo de uma folha de pagamento, 
//sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).
//O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
//Desconto do IR:
//Salário Bruto até 900 (inclusive) - isento
//Salário Bruto até 1500 (inclusive) - desconto de 5%
//Salário Bruto até 2500 (inclusive) - desconto de 10%
//Salário Bruto acima de 2500 - desconto de 20%
//Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.

//(Nota: veja a tabela no site que deixei no README)
import java.util.Scanner;
public class Atv12{
    public static void main(String[]args){
        System.out.println("<<< Programa para o cálculo de uma folha de pagamento >>>");
        System.out.println("Informe quanto ganha por hora: >>>");
        Scanner read = new Scanner(System.in);
        double ganhaHora = read.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas por mês: >>>");
        double horasMes = read.nextDouble();
        read.close();
        
        double salarioBruto,ir,inss,fgts,totalDescontos,salarioLiquido;
        salarioBruto = ganhaHora * horasMes;
        inss = 0.1;
        fgts = 1.1;

        if(salarioBruto <= 900){
            ir = 0;
            totalDescontos = inss + ir;
//            salarioLiquido = 
//apenas printe o FGTS na tela para o usuário ver
        }
        

    }
}