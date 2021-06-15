package LPII.Atividade1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[11];
        int i;
        int x;
        int menor;
        int pos = 0;

        System.out.println("Digite 10 numeros inteiros");

        for(i=0; i<10; i++){
            System.out.println("Digite o numero");
            vetor[i] = ler.nextInt();
        }

            menor = vetor[0];
            System.out.println("NUMERO:");

        for(x=0; x<10; x++){
            System.out.println(" " + vetor[x]);
            if(vetor[x]<menor){
                menor = vetor[x];
                pos = x;}
        }
        System.out.println("Menor Elemento = " + menor);
        System.out.println("Posicao do Elemento = " + pos);

    }
}
