package LPII.PROVA;

public class docente extends usuario {

    private String tipo;

    public docente(String nome){
        super(nome);
    }

    public void imprimirMensagem(){
        int ultimamsg = this.getListaMensagensRecebidas().size() - 1;
        mensagem msg = this.getListaMensagensRecebidas().get(ultimamsg);
        System.out.println("Docente: " +this.getNome()+ " " +msg.toString());
    }

}
