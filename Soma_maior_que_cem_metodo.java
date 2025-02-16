package MetodoLala;

import java.util.Scanner;

public class Soma_maior_que_cem_metodo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("insira 2 numeros:");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        int soma = calculo(numero1,numero2);

        showResult(soma);

        sc.close();
    }

    public static int calculo (int numero1,int numero2) {
        int aux;
        int soma = numero1 + numero2;

        if (soma > 100) {
            aux = 1;

        } else {
            aux = 2;
        }
        return aux;
    }

    public static void showResult(int aux) {
        if (aux == 1) {
            System.out.println("a soma é maior que 100");
        } else {
            System.out.println("a soma nao é maior que 100");
        }
    }
}