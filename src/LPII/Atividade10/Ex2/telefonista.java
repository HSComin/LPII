package LPII.Atividade10.Ex2;

public class telefonista extends funcionario{
    private int esttrabalho;

    public void imprimirt(){
        System.out.println("\n Dados do Telefonista");
        this.imprimir();
        System.out.println("Estação de Trabalho: " + esttrabalho);
    }

    public int getEsttrabalho() {
        return esttrabalho;
    }

    public void setEsttrabalho(int esttrabalho) {
        this.esttrabalho = esttrabalho;
    }
}
