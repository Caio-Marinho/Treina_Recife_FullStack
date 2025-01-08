package Logica;
import java.util.Scanner;

public class Questao23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mega_bytes,mega_bits_por_segundos;
        double tempo_download,converter_bits_bytes;

        System.out.println("Digite o tamanho do arquivo em MB: ");
        mega_bytes = sc.nextInt();
        System.out.println("Digite o a velocidade da sua internet em MBPS: ");
        mega_bits_por_segundos = sc.nextInt();
        
        converter_bits_bytes = mega_bits_por_segundos/8;
        tempo_download = (double)(mega_bytes / converter_bits_bytes)/60;
        System.out.printf("O tempo de download do arquivo em minutos é: %.2f minutos ", tempo_download);
        sc.close();
    }
}