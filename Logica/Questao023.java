package Logica;
import java.util.Scanner;

public class Questao023{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int megaBytes, megaBitsPorSegundo;
        double tempoDownload, converterBitsParaBytes;
        System.out.println("Digite o tamanho do arquivo em MB: ");
        megaBytes = scanner.nextInt();
        System.out.println("Digite a velocidade da sua internet em MBPS: ");
        megaBitsPorSegundo = scanner.nextInt();
        converterBitsParaBytes = megaBitsPorSegundo / 8.0;
        tempoDownload = (double)(megaBytes / converterBitsParaBytes) / 60;
        System.out.printf("O tempo de download do arquivo em minutos é: %.2f minutos ", tempoDownload);
        scanner.close();
    }
}