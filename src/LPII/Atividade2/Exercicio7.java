package LPII.Atividade2;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vet = new int[10];
        int i, num;

        System.out.println("Voce vai digitar 10 numeros inteiros");

        for(i=0; i<10; i++){
            System.out.println("Digite um numero");
            vet[i] = ler.nextInt();
        }

        System.out.println("\nDigite um numero para conferencia");
        num = ler.nextInt();

        for(i=0; i<10; i++)
            if(num==vet[i])
                System.out.println("\nO valor digitado esta no vetor\n Valor = " +vet[i]);
            else if(num!=vet[i])
                System.out.println("\nO valor digitado nao esta no vetor\n Valor = " +vet[i]);
    }
}
