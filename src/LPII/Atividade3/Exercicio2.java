package LPII.Atividade3;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int val, i, j;
        String[] num2 = {"um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "zero"};
        String x = "";
        char[] num1 = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        System.out.println("Digite um numero inteiro");
        val = ler.nextInt();

        for (i = 0; i < String.valueOf(val).length(); i++) {
            char v = String.valueOf(val).charAt(i);
            for (j = 0; j < num1.length; j++) {
                if (num1[j] == v)
                    if (String.valueOf(val).length() == (i + 1)) {
                        x += num2[j];
                    } else {
                        x += num2[j] + ", ";
                    }
            }
        }
        System.out.println("Resultado: " + x);

    }
}


