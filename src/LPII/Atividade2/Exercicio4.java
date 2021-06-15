package LPII.Atividade2;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String valor;
        String[] x;
        int i = 0;
        int carac = 0;
        int pal = 0;

        System.out.println("Digite o texto desejado");
        valor = ler.nextLine();

        for(i = 0; i < valor.length(); i++) {
            if(valor.charAt(i) != ' ')
                carac++;
        }
        x = valor.split(" ");
        pal = x.length;
        System.out.println(" Caracteres = " + carac + "\n Palavras = " + pal);
    }
}
