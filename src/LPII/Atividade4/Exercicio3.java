package LPII.Atividade4;

public class Exercicio3 {

    public static void main(String[] args) {

        StringBuilder frase = new StringBuilder();

        frase.append("pQpupapnpdpo pepu peprpa pcprpipapnpçpa, pupspapvpa pmpupiptpo pa plpípnpgpupap pdpo pP");

        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i) == 'p'){
                frase.delete(i, i+1);
            }
        }

        System.out.println(frase);
    }
}
