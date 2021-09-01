package LPII.PROVA;

public class visitante extends usuario {

    private String tipo;

    public visitante(String nome){
        super(nome);
    }

    public void imprimirMensagem(){
        int ultimamsg = this.getListaMensagensRecebidas().size() - 1;
        mensagem mensagem = this.getListaMensagensRecebidas().get(ultimamsg);
        System.out.println("Visitante: " +this.getNome()+ " " +mensagem.toString());
    }

}
