package LPII.Atividade10.Ex1;

public class docente extends pessoa {
    int matdocente;
    String disciplina;

    public docente(String nome, int idade, int matdocente, String disciplina) {
        super(nome, idade);
        this.matdocente = matdocente;
        this.disciplina = disciplina;
    }

    public void imprimir(){
        System.out.println("\nDocente:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Matricula: " + this.matdocente);
        System.out.println("Disiciplina: " + this.disciplina);
    }
}

