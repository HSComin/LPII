package LPII.Atividade2;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String texto;
        String x;

        System.out.println("Digite um texto");
        texto = ler.nextLine();
        x = texto.trim().replaceAll("\\s+", " ");
        System.out.println(x);
    }
}
