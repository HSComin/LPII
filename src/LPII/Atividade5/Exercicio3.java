package LPII.Atividade5;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String senha;
        String verif = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$";

        System.out.println("Digite sua senha ");
        senha = ler.nextLine();

        Pattern pasenha = Pattern.compile(verif);
        Matcher masenha = pasenha.matcher(senha);
        boolean x = masenha.find();

        if (x) {
            System.out.println("Senha Forte");
        } else
            System.out.println("Senha Fraca, sua senha deve conter no minimo:\nUm digito\nUma letra minúscula\nUma letra maiúscula\nUm caractere especial\n8 caracteres no total");
    }
}
