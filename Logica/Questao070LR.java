package Logica;
import java.util.Scanner;

public class Questao070LR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeUsuario,senha;
        do{
            System.out.println("Digite o nome do usuário: ");
            nomeUsuario = sc.nextLine();
            System.out.println("Digite a senha do usuário: ");
            senha = sc.nextLine();
            if (nomeUsuario.equals(senha)){
                System.out.println("Erro, A senha não pode ser igual ao nome do usuário");
            }
        } while (nomeUsuario.equals(senha));
        System.out.println("Nome do usuário: "+nomeUsuario);
        System.out.println("Senha: "+senha);
        sc.close();
    }
}
