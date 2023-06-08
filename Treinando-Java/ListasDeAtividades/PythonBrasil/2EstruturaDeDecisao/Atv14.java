//14. Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre,
//e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo: (Nota: Veja a tabela no site PythonBrasil)
//O algoritmo deve mostrar na tela as notas,
//a média,
//o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
import java.util.Scanner;
public class Atv14{
    public static void main(String[]args){
        System.out.println("Insira suas duas notas obtidas ao longo do semestre >>> ");
        System.out.println("Primeira nota: ");
        Scanner read = new Scanner(System.in);
        double nota1,nota2,media,nota;
        nota1 = read.nextDouble();
        System.out.println("Segunda nota: ");
        nota2 = read.nextDouble();
        read.close();
        nota = nota1 + nota2;
        media = nota/2;
//self note: String conceito precisava receber um valor. decidi de primeira colocar como " ", porém notei que quando testava uma média bem maior maior que "10.0" não aparecia nada, então decidi colocar algo no lugar.
        String conceito = "Easter ovo";
        String conceitoAluno = "Outro pascoa de egg";

        if(media >= 0 && media < 4.0){
            conceito = "E";
            conceitoAluno =  "Reprovado";
        }else if(media >= 4.0 && media < 6.0){
            conceito = "D";
            conceitoAluno = "Reprovado";
        }else if(media >= 6.0 && media < 7.5){
            conceito = "C";
            conceitoAluno = "Aprovado";
        }else if(media >= 7.5 && media < 9.0){
            conceito = "B";
            conceitoAluno = "Aprovado";
        }else if(media >= 9.0 && media <= 10.0){
            conceito = "A";
            conceitoAluno = "Aprovado";
        }
//essa parte dava erro pois as variáveis "conceito" e "conceitoAluno" não receberam valores ao declarar elas. Levou um tempo pra descobrir isso sozinha.     

        System.out.println("Sua nota é: "+nota+".");
        System.out.println("Sua média é: "+media+".");
        System.out.println("O conseito obtido foi de: "+conceito+".");
        System.out.println("O aluno foi "+conceitoAluno+".");
    }
}