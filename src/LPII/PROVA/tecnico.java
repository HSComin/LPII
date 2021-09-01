package LPII.PROVA;

public class tecnico extends usuario {

    private String tipo;

    public tecnico(String nome){
        super(nome);
    }

    public void imprimirMensagem(){
        int ultimamsg = this.getListaMensagensRecebidas().size() - 1;
        mensagem msg = this.getListaMensagensRecebidas().get(ultimamsg);
        System.out.println("Tecnico: " +this.getNome()+ " " +msg.toString());
    }

}
