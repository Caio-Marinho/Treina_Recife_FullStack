public class Objeto {
    public static String modelo;

    public static void main(String[] args) {
        carro("Fusqinha");
        acelerar();

    }

    public static void carro (String modelo) {
        modelo = modelo + " amarelo";

    }

    public static void acelerar(){
        System.out.println("Acc "+ modelo);
    }

    public static void frear(){
        System.out.println("Frear "+ modelo);
    }
}
