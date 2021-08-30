package LPII.Atividade10.Ex1;

public class tae extends pessoa {
    String projeto;

    public tae(String nome, int idade, String projeto) {
        super(nome, idade);
        this.projeto = projeto;
    }

    public void imprimir(){
        System.out.println("\nTécnico administrativo em educação:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Projeto: " + this.projeto);
    }
}
