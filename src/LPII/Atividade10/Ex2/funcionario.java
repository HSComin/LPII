package LPII.Atividade10.Ex2;

public class funcionario {
    private String nome;
    private double salario;

    public double calculabonificacao(){
        return this.salario * 0.1;
    }

    void imprimir(){
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("Bonificacao: " + calculabonificacao());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
