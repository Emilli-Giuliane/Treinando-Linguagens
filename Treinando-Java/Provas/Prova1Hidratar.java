import java.util.Scanner;
public class Prova1Hidratar{
    public static void main(String[]args){
        System.out.print("<<< Programa para ajudar a se hidratar melhor >>>\n\n ");
        System.out.print("Informe seu nome no espaço ao lado: ");
Scanner ler = new Scanner(System.in);
            String nome = ler.nextLine();
        System.out.println("");
        System.out.print("Informe seu peso (em kg): ");
            double peso = ler.nextDouble();
        System.out.println("");
        System.out.print("Informe quanto de água ja bebeu hoje (em litros): ");
            int bebHoje = ler.nextInt();

ler.close();
            double quantIdeal = (peso*35)/1000;
            double ingerirNoDia = quantIdeal - bebHoje;

        System.out.println("");
        System.out.printf("O funcionário \"%s\", que tem peso igual a \"%2.0fkg\", ingeriu hoje \"%d litros\" de água.\n",nome,peso,bebHoje);
        System.out.printf("Este funcionário deve beber \"%2.0f litros\" para alcançar uma quantidade ideal de água por dia.\n",Math.ceil(quantIdeal));

        if(ingerirNoDia < 0){
            System.out.print("Parabéns, você atingiu a meta de hidratação diária!");
        }else{
            System.out.printf("Continue focado em se hidratar, por hoje ainda faltam \"%2.0f litros\"! Você consegue!",ingerirNoDia);
        }
        System.out.print("\n\n");
    }
}