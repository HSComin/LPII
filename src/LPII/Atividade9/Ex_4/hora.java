package LPII.Atividade9.Ex_4;

public class hora {

    int hora;
    int minuto;
    int segundo;

    public hora(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }
}
