package LPII.Atividade10.Ex1;

public class aluno extends pessoa {
    int matricula;

    public aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void imprimir() {
        System.out.println("Aluno: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Matricula: " + this.matricula);
    }
}
