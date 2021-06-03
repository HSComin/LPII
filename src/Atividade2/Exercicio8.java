package Atividade2;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vet = new int[15];
        int i, x, y;

        System.out.println("Voce vai digitar 15 numeros");

        for (i=0; i<15; i++) {
            System.out.println("Digite os numeros");
            vet[i] = ler.nextInt();
        }

        for (i=0; i<15; i++) {
            for (x=i; x<15; x++) {
                if (vet[i] < vet[x]) {
                    int temp = vet[i];
                    vet[i] = vet[x];
                    vet[x] = temp;
                }
            }
        }

        System.out.println(" ");
        for (y=0; y<15; y++) {
            System.out.println(vet[y] + " ");
        }
    }
}
