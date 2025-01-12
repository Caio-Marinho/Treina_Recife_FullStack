package Logica;
import java.util.Scanner;

public class Questao046 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double salarioBruto,fgts, impostoRenda,inss,descontoInss,sindicato,descontoSindicato,descontoFGTS,salarioLiquido,horaMes,valorHora,totalDescontado,descontoImpostoRenda;
     inss = 0.1;
     fgts = 0.11;
     sindicato = 0.03;
     System.out.println("Digite a hora trabalhada no mês: ");
     horaMes = sc.nextDouble();
     System.out.println("Informe o valor da sua hora: ");
     valorHora = sc.nextDouble();
     salarioBruto = valorHora * horaMes;
     sc.close();
        if (salarioBruto <= 900){
            impostoRenda = 0;
        } else if (salarioBruto > 900 && salarioBruto <=1500){
            impostoRenda = 0.05;
        } else if (salarioBruto>1500 && salarioBruto <=2500){
            impostoRenda = 0.1;
        }else{
            impostoRenda = 0.2;
        }
        descontoInss = salarioBruto * inss;
        descontoImpostoRenda = impostoRenda * salarioBruto;
        descontoSindicato = salarioBruto * sindicato;
        descontoFGTS = salarioBruto * fgts;
        totalDescontado = descontoFGTS + descontoInss  + descontoSindicato + impostoRenda;
        salarioLiquido = salarioBruto - totalDescontado;
        System.out.printf("Horas Trabalhadas no mês: %.2f\n",horaMes);
        System.out.printf("Salario por hora: %.2f\n",valorHora);
        System.out.printf("Salario Bruto: %.2f\n",salarioBruto);
        System.out.printf("(-)INSS (%.2f%%) - R$ %.2f\n",inss*100,descontoInss);
        System.out.printf("(-)Sindicato (%.2f%%) - R$ %.2f\n",sindicato*100,descontoSindicato);
        System.out.printf("(-)Imposto de Renda (%.2f%%) - R$ %.2f\n",impostoRenda*100,descontoImpostoRenda);
        System.out.printf("(-)FGTS (%.2f%%) - R$ %.2f\n",fgts*100,descontoFGTS);
        System.out.printf("Total Descontado: R$ %.2f\n",totalDescontado);
        System.out.printf("Salario Liquido: R$ %.2f\n",salarioLiquido);
    }
}
