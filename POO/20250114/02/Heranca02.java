public class Heranca02 {
    public Heranca02() {
        // consturtor
    }

    public static void main(String[] args) {
        Veiculo carro = new Carro();
        carro.acelerar(15.8);

        Carro novoCarro = new Carro();
        novoCarro.acelerar();

        Moto novaMoto = new Moto();
        novaMoto.acelerar();
    }
}

// SuperClasse
class Veiculo {
    public void acelerar(double intensidade) {
        System.out.println("Veiculo acelerando..." + intensidade);
    }
}

// SubClasse
class Carro extends Veiculo {
    public void acelerar() {
        System.out.println("Acelerando o carro...");
    }
}

// SubClasse
class Moto extends Veiculo {
    public void acelerar() {
        System.out.println("Dei o grau!!!");
    }
}