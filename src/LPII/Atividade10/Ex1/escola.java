package LPII.Atividade10.Ex1;

import java.util.ArrayList;

public class escola {
    ArrayList<pessoa> lista;

    escola() {
        this.lista = new ArrayList<pessoa>();
    }
    public void addpessoa(pessoa x) {
        this.lista.add(x);
    }

    public void imprimir(){
        System.out.println("\n Todas as pessoas da escola: \n");
        for(pessoa x : this.lista){
            System.out.println(x.nome);
        }
    }
}
