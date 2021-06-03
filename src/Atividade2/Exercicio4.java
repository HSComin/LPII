package Atividade2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[20];
        int i;
        int num;

        System.out.println("Digite 20 numeros inteiros");

        for(i=0; i<20; i++){
            System.out.println("Digite o vetor " + i);
            vetor[i] = ler.nextInt();
        }

        for(i=0; i<10; i++){
            num=vetor[i];
            vetor[i]=vetor[19-i];
            vetor[19-i]=num;
        }

        for(i=0; i<20; i++){
            System.out.println("Novo Vetor = " +vetor[i]);
        }

    }
}
