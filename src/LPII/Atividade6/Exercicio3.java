package LPII.Atividade6;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        Scanner ler = new Scanner(System.in);
        String excluir;

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

        System.out.print("\nDigite um nome que deseja remover da lista ou digite \"clear\" para limpar a lista: \n");
        excluir = ler.nextLine();

        if(excluir.equals("clear")){
            nomes.clear();
        } else if(nomes.contains(excluir)){
            nomes.remove(excluir);
        } else {
            System.out.print("\nNome não encontrado na lista!");
        }

        if(nomes.size()>0){
            for (int i = 0; i < nomes.size(); i++) {
                System.out.print("\n" + i + "- " + nomes.get(i));
            }
        } else {
            System.out.print("\nLista vazia!");
        }
    }
}

