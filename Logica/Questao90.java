package Logica;

public class Questao90 {
    public static void main(String[] args) {
        int a=1,b=1,c=0;
        System.out.print(a + " " + b + " ");
        while (c <=  500 ) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(b + " ");
        }
    }
}
