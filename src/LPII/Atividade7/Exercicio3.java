package LPII.Atividade7;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opcao;
        boolean x = true;

        ArrayList<String> list = new ArrayList();

        System.out.println("1 – Cadastrar\n2 – Listar\n3 – Remover\n");
        System.out.print("Digite a Opção que deseja realizar:\n");
        opcao = ler.nextInt();
        while(x == true) {
            if(opcao==1){
                System.out.println("\nCadastrar Contatos:");
                System.out.print("Digite o nome do seu contato\n");
                String nome = ler.next();
                System.out.print("Digite um telefone do seu contato\n");
                String telefone = ler.next();
                String contato = nome + ";" + telefone;
                list.add(contato);
                System.out.println("O numero de " + nome + " é " + telefone);
                System.out.println("\n");

            } else if(opcao==2){
                System.out.println("Listar Contatos:");
                for(int i=0; i<list.size(); i++){
                    String y = list.get(i);
                    String[] splited = y.split(";");
                    String nomelista = splited[0];
                    String telelista = splited[1];
                    System.out.println("[ID: " + i + "] - " + nomelista + " - " + telelista);
                }
            } else if(opcao==3){
                System.out.println("Deletar Contatos:\nSelecione a ID do contato que deseja deletar:");
                for(int i=0; i<list.size(); i++){
                    String z = list.get(i);
                    String[] a = z.split(";");
                    String excnome = a[0];
                    String exctele = a[1];
                    System.out.println("[ID: " + i + "] - " + excnome + " - " + exctele);
                }

                int id = ler.nextInt();
                list.remove(id);
                System.out.println("ID " + id + " deletada dos contatos\n");

            } else {
                System.out.println("ID nao encontrada");
                System.out.println("\n");
            }
            System.out.println("Para sair digite 0, para continuar digite 1");
            String saida = ler.next();
            if(saida.equals("1")){
                x = true;
                System.out.println("1 – Cadastrar\n2 – Listar\n3 – Remover\n");
                System.out.print("Digite a Opção que deseja realizar:\n");
                opcao = ler.nextInt();
            } else {
                x = false;
            }
        }
    }
}