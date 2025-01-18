public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5.0);
        System.out.println("Quadrado sem parâmetro: " + quadrado.area());
        System.out.println("Quadrado com parâmetro: " + quadrado.area(7.0));
        Triangulo triangulo = new Triangulo(3.0, 4.0);
        System.out.println("Triangulo sem parâmetro: " + triangulo.area());
        System.out.println("Triangulo com parâmetro: " + triangulo.area(7, 8));
        System.out.println("Triangulo com parâmetro: " + triangulo.area( 8.0));
    }
}
