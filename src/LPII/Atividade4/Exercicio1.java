package LPII.Atividade4;

public class Exercicio1 {

    public static void main(String[] args){

        String frase = "Socorram-me, subi no ônibus em Marrocos", fraseinv[];
        fraseinv = frase.split(" ");

        System.out.println(fraseinv[5] + " "
                + fraseinv[4] + " "
                + fraseinv[3] + " "
                + fraseinv[2] + " "
                + fraseinv[1] + " "
                + fraseinv[0]);
    }
}