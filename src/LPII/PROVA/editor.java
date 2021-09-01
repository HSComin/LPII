package LPII.PROVA;
import java.util.ArrayList;

public class editor {

    private String nome;
    private ArrayList<usuario> ListaSeguidores = new ArrayList<>();

    public editor(String nome){
        this.nome = nome;
    }

    public void cadastrarSeguidor(usuario usr){
        this.ListaSeguidores.add(usr);
    }


    public void enviarMensagem(mensagem msg) {
        for (int i = 0; i < this.ListaSeguidores.size(); i++) {
            this.ListaSeguidores.get(i).receberMensagem(msg);
        }
    }
}
