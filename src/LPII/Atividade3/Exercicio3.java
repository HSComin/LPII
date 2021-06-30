package LPII.Atividade3;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome, sobrenome;
        String x = "";
        String [] x2;
        int i;

        System.out.println("Digite um nome");
        nome = ler.nextLine();
        sobrenome = nome.replaceAll(" e ", " ").replaceAll(" do ", " ").replaceAll(" da ", " ").replaceAll(" dos ", " ")
                .replaceAll(" das ", " ").replaceAll(" de ", " ").replaceAll(" di ", " ").replaceAll(" du ", " ");
        x2 = sobrenome.split(" ");
        for (i = 0; i < x2.length; i++) {
            x += x2[i].charAt(0);
        }
        System.out.println(nome + " \n Iniciais do nome = " + x.toUpperCase());
    }
}
