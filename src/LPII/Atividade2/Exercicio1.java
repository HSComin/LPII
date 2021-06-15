package LPII.Atividade2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        String x;
        Scanner ler = new Scanner(System.in);
        int vog = 0;
        int i;
        int num = 0;

        System.out.println("Digite uma palavra");
        x = ler.next();

        System.out.println("O número de caracteres da palavra é: " + x.length());
        System.out.println("Palavra em letras maiusculas: " + x.toUpperCase());

        for (i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (c == 'a' ||
                    c == 'A' ||
                    c == 'e' ||
                    c == 'E' ||
                    c == 'i' ||
                    c == 'I' ||
                    c == 'o' ||
                    c == 'O' ||
                    c == 'u' ||
                    c == 'U') {
                vog++;
            }
        }
        System.out.println("O número de vogais da palavra é: " + vog);

        if (x.toLowerCase().startsWith("uni")) {
            System.out.println("Começa com UNI");
        } else {
            System.out.println("Não começa com UNI");
        }

        if (x.toLowerCase().endsWith("rio")) {
            System.out.println("Termina com RIO");
        } else {
            System.out.println("Não termina com RIO");
        }

        for (i = 0; i < x.length(); i++){
            if( Character.isDigit(x.charAt(i))){
                num++;
            }
        }
        System.out.println("A Palavra tem " + num + " numeros");

        StringBuilder z = new StringBuilder(x);
        if (x.equals(z.reverse().toString())){
            System.out.println("A palavra é um palíndromo");
        }else{
            System.out.println("A palavra não é um palíndromo");
        }
    }
}
