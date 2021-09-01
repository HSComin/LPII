package LPII.PROVA;

import java.util.ArrayList;

public abstract class usuario {

    private String nome;
    public ArrayList<mensagem> ListaMensagensRecebidas = new ArrayList<>();

    public usuario(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<mensagem> getListaMensagensRecebidas(){
        return this.ListaMensagensRecebidas;
    }

    public void receberMensagem(mensagem msg){
        this.cadastrarMensagem(msg);
        this.imprimirMensagem();
    }

    public void cadastrarMensagem(mensagem msg){
        this.ListaMensagensRecebidas.add(msg);
    }

    public void imprimirMensagem(){

    }
}
