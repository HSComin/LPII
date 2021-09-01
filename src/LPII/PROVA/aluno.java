package LPII.PROVA;

public class aluno extends usuario{

    private String tipo;

    public aluno(String nome){
        super(nome);
    }

    public void imprimirMensagem(){
        int ultimamsg = this.getListaMensagensRecebidas().size() - 1;
        mensagem msg = this.getListaMensagensRecebidas().get(ultimamsg);
        System.out.println("Aluno: " +this.getNome()+ " " +msg.toString());
    }
}
