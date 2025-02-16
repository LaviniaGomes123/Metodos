package MetodoLala;

import java.util.Scanner;

public class Ano_bissexto_metodo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("insira um ano");
        int ano = sc.nextInt();
        

        int bissexto = calculo(ano);

        showResult(bissexto);

        sc.close();
    }

    public static int calculo (int ano) {
        int aux;

        if ((ano % 4 ==0 && ano % 100 != 0) || (ano % 400 == 0)) {
            aux = 1;

        } else {
            aux = 2;
        }
        return aux;
    }

    public static void showResult(int aux) {
        if (aux == 1) {
            System.out.println("É ano bissexto");
        } else {
            System.out.println("Não é ano bissexto");
        }
    }
}