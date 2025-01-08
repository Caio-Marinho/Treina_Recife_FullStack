package Logica;
import java.util.Scanner;

public class Questao23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mega_bytes,mega_bytes_por_segundos;
        double tempo_download;
        System.out.println("Digite o tamanho do arquivo em MB: ");
        mega_bytes = sc.nextInt();
        System.out.println("Digite o a velocidade da sua internet em MBPS: ");
        mega_bytes_por_segundos = sc.nextInt();
        tempo_download = (double)(mega_bytes / mega_bytes_por_segundos)/60;
        System.out.println("O tempo de download do arquivo em minutos é: " + tempo_download);
        sc.close();
    }
}