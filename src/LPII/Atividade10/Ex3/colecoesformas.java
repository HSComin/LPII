package LPII.Atividade10.Ex3;
import java.util.ArrayList;

public class colecoesformas {
    ArrayList<forma> lista;

    colecoesformas() {
        this.lista = new ArrayList<forma>();
    }

    public void addFormas(forma forma) {
        this.lista.add(forma);
    }

    public void imprimir(){
        System.out.println("Aqui estao todas as formas: ");
        for(forma f : this.lista){
            System.out.println(f);
        }
    }
}
