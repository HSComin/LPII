package LPII.Atividade6;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList();

        System.out.printf("\nDigite um Nome:\n");
        String addnome = ler.nextLine();

        while(addnome.length()!=0) {
            if (!nomes.contains(addnome)){
                nomes.add(addnome);
                int position = nomes.indexOf(addnome);
                System.out.println("O nome " + addnome + " foi adicionado na posicao " + position);
            } else {
                System.out.println("Este nome ja esta na lista!");
            }

            System.out.printf("\nInforme um nome para adicionar na lista ou não digite nada para terminar de inserir\n");
            addnome = ler.nextLine();
            System.out.println(addnome);
        }

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(i + "- " + nomes.get(i));
        }
    }
}
