package LPII.Atividade2;

import java.util.Scanner;

public  class  Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int i;
        int pares = 0;
        int[] vetor = new int[20];

        System.out.println("Digite 20 numeros inteiros");

        for (i=0; i<20; i++) {
            System.out.println("Digite um valor");
            vetor[i] = ler.nextInt();
        }

        System.out.println("Numeros = ");

        for (i=0; i<20; i++) {
            System.out.println(" " + vetor[i]);
        }

        for (i=0; i<20; i++) {
            if (vetor[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de pares = " + pares);

    }
}