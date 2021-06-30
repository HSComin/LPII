package LPII.Atividade5;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String numero;
        String verifcell = "(\\s)?(\\d{5}\\-\\d{4})";
        String veriffixo = "(\\s)?(\\d{4}\\-\\d{4})";

        System.out.println("Digite o numero de telefone: ");
        numero = ler.nextLine();

        Pattern pcell = Pattern.compile(verifcell);
        Matcher matchcell = pcell.matcher(numero);
        boolean mvc = matchcell.find();

        Pattern pfixo = Pattern.compile(veriffixo);
        Matcher matchfix = pfixo.matcher(numero);
        boolean mvf = matchfix.find();

        if (mvc) {
            System.out.println("Telefone Celular");
        } else if (mvf) {
            System.out.println("Telefone Fixo");
        } else {
            System.out.println("Telefone Invalido");
        }
    }
}
