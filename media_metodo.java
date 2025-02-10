package MetodoLala;

import javax.xml.transform.Result;
import java.util.Scanner;

public class media_metodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a nota do aluno");
        double nota = sc.nextDouble();

        double media = cauculo(nota);

        Result(media);

        sc.close();
    }
    public static double cauculo(double nota){
        int media;
        if (nota < 5){
            media =1;
        }else if (nota >= 5 && nota < 7){
            media=2;
        }else{
            media =3;
        }
        return media;
    }
    public static void Result(double media){
        if (media == 1){
            System.out.println("Reprovado");
        } else if (media == 2) {
            System.out.println("Recuperacao");
        } else if (media == 3) {
            System.out.println("Aprovado");
        }
    }
}
