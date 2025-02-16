package MetodoLala;

import java.util.Scanner;

public class Senha_metodo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("INSIRA A SENHA:");
        int senha = sc.nextInt();

        int senhaCorreta = verificando(senha);

        showResult(senhaCorreta);

        sc.close();
    }

    public static int verificando(int senha) {
        int aux;

        if (senha == 1234) {
            aux = 1;

        } else {
            aux = 2;
        }
        return aux;
    }

    public static void showResult(int aux) {
        if (aux == 1) {
            System.out.println("Bem Vindo!");
        } else {
            System.out.println("senha incorreta!");
        }
    }
}