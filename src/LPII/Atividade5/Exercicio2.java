package LPII.Atividade5;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercicio2 {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        String url;
        String verif = "^(((https?|ftp)://)?([\\w\\-.])+(\\.)([\\w]){2,4}([\\w/+=%&_.~?\\-]*))*$";

        System.out.println("Digite uma URL ");
        url = ler.nextLine();

        Pattern paurl = Pattern.compile(verif);
        Matcher maurl = paurl.matcher(url);
        boolean x = maurl.find();

        if (x) {
            System.out.println("URL válida");
        } else
            System.out.println("URL inválida");
    }
}


