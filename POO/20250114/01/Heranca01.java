public class Heranca01 {
    public Heranca01(){
        //consturtor
    }
    public static void main(String[] args) {
        //
    }
}

//SuperClasse
class Veiculo{
    public void acelerar(double intensidade){
        System.out.println("Veiculo acelerando..."+intensidade);
    }
}

//SubClasse
class Carro extends Veiculo {
    public void acelerar(){
        System.out.println("Acelerando o carro...");
    }
}

//SubClasse
class Moto extends Veiculo {
    public void acelerar(){
        System.out.println("Dei o grau!!!");
    }
}