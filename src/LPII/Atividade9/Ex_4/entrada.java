package LPII.Atividade9.Ex_4;

public class entrada {

    private data data;
    private hora hora;
    private int sala;
    private float valor;

    public entrada(data data, hora hora, int sala, float valor) {
        this.data = data;
        this.hora = hora;
        this.sala = sala;
        this.valor = valor;
    }

    public void desconto12(data nasc) {
        int idade = this.data.ano - nasc.ano;
        System.out.println("O cliente tem " + idade + " anos");

        if (idade < 12) {
            this.valor = (float) (this.valor / 2);
        }
    }

    public void desconto1215(data nasc, int cartest) {
        int idade = this.data.ano - nasc.ano;
        System.out.println("O cliente tem " + idade + " anos");

        if (idade >= 12 && idade <= 15) {
            this.valor = (float) (this.valor * 0.6);
        } else {
            if (idade >= 16 && idade <= 20) {
                this.valor = (float) (this.valor * 0.7);
            } else {
                if (idade > 20) {
                    this.valor = (float) (this.valor * 0.8);
                }
            }
        }
    }

    public void horadesconto () {
        if(this.hora.hora < 16){
            this.valor = (float) (this.valor * 0.9);
        }
    }

    @Override
    public String toString() {
        return "entrada{" +
                "data=" + data +
                ", hora=" + hora +
                ", sala=" + sala +
                ", valor=" + valor +
                '}';
    }
}


