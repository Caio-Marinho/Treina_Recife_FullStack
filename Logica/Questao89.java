
package Logica;

import java.util.Scanner;

public class Questao89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a = 1, b = 1, c;
        System.out.println("Até qual termo deseja gerar a série de Fibonacci? ");
        n = sc.nextInt();
        sc.close();
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(b + " ");
            
        }
    }
}