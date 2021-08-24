package LPII.Atividade9.Ex_4;

public class data {

    int dia;
    int mes;
    int ano;

    public data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
