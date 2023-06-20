/*15.Faça um Programa que peça os 3 lados de um triângulo.
 * O programa deverá informar se os valores podem ser um triângulo.
 * Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
 * Dicas:
 * °Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
 * °Triângulo Equilátero: três lados iguais;
 * °Triângulo Isósceles: quaisquer dois lados iguais;
 * °Triângulo Escaleno: três lados diferentes;
 */
import java.util.Scanner;
public class Atv15{
    public static void main(String[]args){
        System.out.println("Insira três lados de um triangulo para saber se esses valores podem gerar um triangulo e qual triangulo vai gerar.\nPrimeiro lado: ");
        Scanner read = new Scanner(System.in);
        float lado1 = read.nextFloat();
        System.out.println("Segundo lado: ");
        float lado2 = read.nextFloat();
        System.out.println("Segundo lado: ");
        float lado3 = read.nextFloat();
        float testeLado1 = lado2 + lado3;
        String tipoTriangulo = "";
        read.close();

        if(testeLado1 >= lado1){
            System.out.print("Os lados informados podem criar um triangulo ");
            if(lado1 == lado2 && lado1 ==lado3){
            tipoTriangulo = "Equilátero";
            System.out.println(tipoTriangulo+".");
        }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            tipoTriangulo = "Isósceles";
            System.out.println(tipoTriangulo+".");
        }else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            tipoTriangulo = "Escaleno";
            System.out.println(tipoTriangulo+".");
        }}else{
            System.out.println("Os lados informados não podem criar um triangulo."); 
            
        }
    }
}