package LPII.Atividade4;

public class Exercicio2 {

    public static void main(String[] args) {

        String frase = "Socorram-me, subi no ônibus em Marrocos";
        String[] fraseinv = frase.split(" ");
        StringBuilder x = new StringBuilder();

        for (int i = fraseinv.length - 1; i >= 0; i--) {
            x.append(fraseinv[i] + " ");
        }

        System.out.println(x);
    }
}

