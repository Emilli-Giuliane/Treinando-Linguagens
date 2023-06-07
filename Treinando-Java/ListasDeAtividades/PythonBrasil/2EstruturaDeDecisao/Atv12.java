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
        
        double salarioBruto,ir,inss,fgts,totalDescontos,salarioLiquido,totalDescontoIr,totalDescontoInss,totalFgts;
        String descontoIr,descontoInss,descontoFgts;
        salarioBruto = ganhaHora * horasMes;
        descontoInss = "10%";
        inss = 0.1;
        descontoFgts = "11%";
        fgts = 1.1;
//apenas printe o FGTS na tela para o usuário ver

        if(salarioBruto <= 900){
            descontoIr = "Isento";
            ir = 0;            
        }else if(salarioBruto <= 1500){
            descontoIr = "5%";
            ir = 0.05;
        }else if(salarioBruto <= 2500){
            descontoIr = "10%";
            ir = 0.1;
        }else{
            descontoIr = "20%";
            ir = 0.2;
        }

        totalDescontoIr = ir * salarioBruto;
        totalFgts = fgts * salarioBruto;
        totalDescontoInss = inss * salarioBruto;
        totalDescontos = totalDescontoInss + totalDescontoIr;
        salarioLiquido = salarioBruto - totalDescontos;
        System.out.printf("Salario bruto: (%2.0f * %2.0f)           : R$%2.0f. \n",ganhaHora,horasMes,salarioBruto);
        System.out.printf("(-) IR (%s)                           : R$%2.0f.\n",descontoIr,totalDescontoIr);
        System.out.printf("(-) INSS (%s)                          : R$%2.0f.\n",descontoInss,totalDescontoInss);
        System.out.printf("FGTS (%s)                             : R$%2.2f.\n",descontoFgts,totalFgts);
        System.out.printf("Total de descontos                         : R$%2.0f.\n",totalDescontos);
        System.out.printf("Salário líquido                             : R$%2.0f.\n",salarioLiquido);
    }
}