package LPII.Atividade9.Ex_4;

public class executar {
    public static void main(String[] args) {

        data diafilme1 = new data(12,02,2020);
        hora horafilme1 = new hora(15,30,00);

        data diafilme2 = new data(27,12,2021);
        hora horafilme2 = new hora(17,00,00);

        data nasc1 = new data(12,01,2001);
        data nasc2 = new data(26,07,2012);
        data nasc3 = new data(01,12,2005);
        data nasc4 = new data(07,10,2007);
        data nasc5 = new data(19,04,1998);

        float valorentrada = (float) 15.00;

        entrada ent1 = new entrada(diafilme1, horafilme1, 7,valorentrada);
        ent1.desconto12(nasc1);
        ent1.horadesconto();
        System.out.println(ent1);

        entrada ent2 = new entrada(diafilme2, horafilme2, 4, valorentrada);
        ent2.desconto12(nasc2);
        ent2.horadesconto();
        System.out.println(ent2);

    }
}
