package LPII.Atividade7;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> listanum = new ArrayList<>();
        ArrayList<Integer> exc = new ArrayList<>();

        int num;

        System.out.println("Informe 10 numeros");

        while (listanum.size() < 10) {
            System.out.println("Digite os numeros ");
            num = ler.nextInt();
            listanum.add(num);
        }

        System.out.println("Lista Original:");
        for (Integer lista : listanum) {
            System.out.print(lista + " ");
        }

        for (Integer lista : listanum) {
            if (lista % 2 != 0) {
                exc.add(lista);
            }
        }

        System.out.println("\n\nLista sem os números pares: ");
        for (Integer lista : exc) {
            System.out.print(" " + lista);
        }
    }
}

