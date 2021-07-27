package LPII.Atividade8;

public class funcionario {

    String nome;
    String departamento;
    String rg;
    data dataentrada;
    double salario;

    public void recebeaumento(double aumento) {

        System.out.println("\nAumento de Salario");
        this.salario = this.salario + (this.salario * (aumento / 100));
        System.out.println("Novo Salario: " + this.salario);
        System.out.println("\n");
    }

    public double ganhoanual() {
        return this.salario * 12;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public data getDataentrada() {
        return dataentrada;
    }

    public void setDataentrada(data dataentrada) {
        this.dataentrada = dataentrada;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrar(){

        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("RG: " + this.rg);
        System.out.println("Salario: " + this.salario);
        System.out.println("Data Entrada: " + this.dataentrada.formatada());
        System.out.println("Ganho Anual: " + this.ganhoanual());

    }
}


