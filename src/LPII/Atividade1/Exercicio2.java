package LPII.Atividade1;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vet1 =  new int[10];
        int[] vet2 = new int[10];
        int[] mult = new int[10];
        int i;

        System.out.println("Digite os 10 primeiros numeros");

        for(i=0; i<10; i++){
            System.out.println("Digite os numeros do 1 vetor");
            vet1[i] = ler.nextInt();
        }

        for(i=0; i<10; i++){
            System.out.println("Digite os numeros do 2 vetor");
            vet2[i] = ler.nextInt();
        }

        for(i=0; i<10; i++) {
            mult[i] = (vet1[i] * vet2[i]);
            System.out.println("Multiplicao dos vetores = " + mult[i]);
        }

    }
}
