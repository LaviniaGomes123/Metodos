package MetodoLala;
import java.util.Scanner;

public class IdadeVotar_TesteMetodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua idade:");
        int idade = sc.nextInt();

        int votar = max(idade);

        showResult(votar);

        sc.close();
    }

    public static int max(int idade) {
        int pode;

        if (idade < 16) {
            pode = 1;

        } else {
            pode = 2;
        }
        return pode;
    }

    public static void showResult(int pode) {
        if (pode == 1) {
            System.out.println(" voce nao pode votar");
        } else {
            System.out.println("voce pode votar");
        }
    }
}
