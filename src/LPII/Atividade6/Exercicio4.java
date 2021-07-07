package LPII.Atividade6;
import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        Scanner ler = new Scanner(System.in);
        String busca;

        nomes.add("fernando");
        nomes.add("pedro");
        nomes.add("joana");
        nomes.add("manuel");
        nomes.add("carlos");
        nomes.add("emanueli");
        nomes.add("leonardo");
        nomes.add("alex");
        nomes.add("rafael");
        nomes.add("bruna");

        System.out.print("\nDigite um nome que deseja buscar na lista: \n");
        busca = ler.nextLine();

        if (nomes.contains(busca)) {
            int index = nomes.indexOf(busca);
            if (index == 0) {
                System.out.println("Nome posterior: " + nomes.get(1)+ "\nNome anterior: Nao Contem");
            } else if (index + 1 == nomes.size()) {
                System.out.println("Nome anterior: " + nomes.get(index - 1) + "\nNome posterior: Nao Contem");
            } else {
                System.out.println("Nome anterior: " + nomes.get(index - 1) + " \nNome posterior: " + nomes.get(index + 1));
            }
        } else {
            System.out.print("\nNome não encontrado na lista!");
        }
    }
}
