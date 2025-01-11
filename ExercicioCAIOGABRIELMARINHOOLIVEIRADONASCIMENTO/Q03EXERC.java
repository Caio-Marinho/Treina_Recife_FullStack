/*03 - Construa um algoritmo para determinar se o indivíduo está com um peso favorável ou não. Essa situação é determinada através do IMC ( Índice de Massa
Corpórea), que é definida como sendo a relação entre o peso (PESO) e o quadrado da Altura (ALTURA) do indivíduo. */

package ExercicioCAIOGABRIELMARINHOOLIVEIRADONASCIMENTO;
import java.util.Scanner;

public class Q03EXERC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso,altura,imc;
        System.out.println("Informe o peso:");
        peso = sc.nextDouble();
        System.out.println("Informe a altura:");
        altura = sc.nextDouble();
        sc.close();
        imc = peso / (altura*altura);
        if (imc < 20){
            System.out.println("Peso baixo");
        } else if (imc >= 20 && imc <= 25){
            System.out.println("Peso normal");
        } else if (imc > 25 && imc <= 30){
            System.out.println("Peso acima do normal");
        } else if (imc > 30 && imc <= 40){
            System.out.println("Obesidade");
        } else {
            System.out.println("Obesidade morbida");
        }
    }
}
