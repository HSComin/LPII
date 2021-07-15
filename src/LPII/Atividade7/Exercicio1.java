package LPII.Atividade7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList();

        int numero;

        System.out.println("Digite um numero inteiro: ");
        System.out.println("Para parar digite um numero negativo: \n");
        numero = ler.nextInt();
        while(numero >= 0) {
            list.add(numero);
            System.out.print("Insira outro numero ou pare\n");
            numero = ler.nextInt();
        }

        System.out.println("\nFor");
        for (int x:list) {
            System.out.println("Numero " +x);
        }

        System.out.println("\nFor Percorrendo Arrays");
        for (Integer y:list) {
            System.out.println("Numero " +y);
        }

        System.out.println("\nIteradores");
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            Integer z = it.next();

            System.out.println("Numero " +z);
        }
    }
}
