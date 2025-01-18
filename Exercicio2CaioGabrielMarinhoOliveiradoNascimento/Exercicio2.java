/*2 - Uma pesquisa sobre algumas características físicas da população de uma
determinada região coletou os seguintes dados referentes a cada habitante
para serem analisados:

• Sexo (“M” - Masculino, “F” - Feminino)
• Cor dos Olhos (“A”-Azul,”V”-Verde, “C"-Castanho)
• Idade em anos

Para cada habitante foi digitada uma linha com esses dados e a última linha,
que não corresponde a ninguém conterá o valor de idade igual a -1. Fazer um
programa que determine e imprima:
a) A maior idade dos habitantes;
b) A porcentagem de indivíduos do sexo feminino cuja idade está entre 18 e
35 anos inclusive e que tenham olhos verdes;
 */

package Exercicio2CaioGabrielMarinhoOliveiradoNascimento;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade,mulher=0,contagemTotal = 0 ,maiorIdade = 0;
        char sexo, corOlho;
        double porcentagem;
        do {

            do {
                System.out.println("Digite sua idade: ");
                idade = sc.nextInt();
                if (idade > 150) {
                    System.out.println("Idade invalida! A idade deve estar entre 0 e 150.");
                }
            } while (idade > 150);

            if (idade <= -1) {
                break;
            }

            do {
                System.out.println("Digite o sexo (M/F):");
                sexo = sc.next().toUpperCase().charAt(0);
                if (sexo != 'M' && sexo != 'F') {
                    System.out.println("Sexo invalido! Use 'M' para masculino ou 'F' para feminino.");
                }
            } while (sexo != 'M' && sexo != 'F');
            
            do{
                System.out.println("Digite a cor dos olhos (A-Azul/V-Verde/C-Castanho):");
                corOlho = sc.next().toUpperCase().charAt(0);
                if (corOlho != 'A' && corOlho != 'V' && corOlho != 'C') {
                    System.out.println("Cor dos olhos invalida! Use 'A' para azul, 'V' para verde e 'C' para castanho.");
                }
            } while (corOlho != 'A' && corOlho != 'V' && corOlho != 'C');

            
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (sexo == 'F' && idade >= 18 && idade <= 35 && corOlho == 'V') {
                mulher++;
            }
            contagemTotal++;
        } while (idade <= -1);
        sc.close();
        porcentagem = ((double)mulher/contagemTotal)*100;
        System.out.println("A maior idade dos habitantes: "+maiorIdade);
        System.out.printf("A porcentagem de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos inclusive e que tenham olhos verdes: %.2f%%",porcentagem);
    }
}
