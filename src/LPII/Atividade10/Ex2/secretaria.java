package LPII.Atividade10.Ex2;

public class secretaria extends funcionario{
    private int ramal;

    public void imprimirs(){
        System.out.println("\n Dados da Secretaria");
        this.imprimir();
        System.out.println("Ramal: " + getRamal());
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
