package LPII.Atividade6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList();

        nomes.add("Fernando");
        nomes.add("Pedro");
        nomes.add("Joana");
        nomes.add("Manuel");
        nomes.add("Carlos");
        nomes.add("Emanueli");
        nomes.add("Leonardo");
        nomes.add("Alex");
        nomes.add("Rafael");
        nomes.add("Bruna");

        Collections.sort(nomes);

        for(int i = 0; i< nomes.size(); i++) {
            System.out.println((i + 1) + "- " + nomes.get(i));
        }
    }
}
