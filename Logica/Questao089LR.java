package Logica;

public class Questao089LR {
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
