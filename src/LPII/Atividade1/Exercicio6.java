package LPII.Atividade1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetorx= new int[10];
        int[] vetory= new int[10];
        int i, j, z;

        for(i=0; i<10; i++) {
            System.out.println("Digite os numeros do vetor de X");
            vetorx[i] = ler.nextInt();
        }
        for(j=0; j<10; j++) {
            System.out.println("Digite os numeros do vetor de Y");
            vetory[j] = ler.nextInt();
        }

        System.out.println("\nUniao de X e Y");
        for(i=0; i<10; i++){
            System.out.println(vetorx[i]);
        }
        for(j=0; j<10; j++){
            System.out.println(vetory[j]);
        }

        System.out.println("\nDiferenca X - Y");
        for(i=0; i<10; i++){
            System.out.println(vetorx[i]-vetory[i]);
        }

        System.out.println("\nSoma de X + Y");
        for(i=0; i<10; i++){
            System.out.println(vetorx[i]+vetory[i]);
        }

        System.out.println("\nMultiplicacao de X * Y");
        for(i=0; i<10; i++){
            System.out.println(vetorx[i]*vetory[i]);
        }

        System.out.println("\nInterseccao de X e Y");
        for(i=0; i<10; i++){
            z =vetorx[i];
            for(j=0; j<10; j++){
                if(z == vetory[j]){
                    System.out.println(z);
                    break;
                }
            }
        }
    }







}