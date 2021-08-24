package LPII.Atividade9.Ex_1_e_2;

public class testepais {
    public static void main(String[] args) {
        Pais p1 = new Pais("BRA", "BRASIL", 8516000.00, 211000000);
        Pais p2 = new Pais("ARG", "ARGENTINA", 2780000.00,44940000);
        Pais p3 = new Pais("URU", "URUGUAI", 176215.00,3462000);
        Pais p4 = new Pais("EQU", "EQUADOR", 283560.00,17370000);
        Pais p5 = new Pais("BOL", "BOLÍVIA", 1099000.00,11510000);

        p1.paisFronteira.add(p2);
        p1.paisFronteira.add(p3);
        p1.paisFronteira.add(p5);
        p2.paisFronteira.add(p1);
        p2.paisFronteira.add(p3);
        p2.paisFronteira.add(p5);
        p3.paisFronteira.add(p1);
        p3.paisFronteira.add(p2);
        p5.paisFronteira.add(p1);
        p5.paisFronteira.add(p2);

//        System.out.print("p1 é igual ao p2? ");
//        boolean resp = p1.ehOMesmoPais(p2);
//        System.out.println(resp);
//
//        System.out.print("Argentina faz fronteira com o Brasil?");
//        resp = p2.ehLimitrofe(p1);
//        System.out.println(resp);
//
//        System.out.println("Paises que fazem fronteira com o Brasil e com a Argentina:");
//        ArrayList<Pais> comuns = p1.vizinhosComuns(p2);
//        for (Pais p : comuns) {
//            System.out.println(p.getNome());
//        }

        Continente america = new Continente ("America");
        america.addPais(p1);
        america.addPais(p2);
        america.addPais(p3);
        america.addPais(p4);
        america.addPais(p5);

        System.out.println("População do Continente: " + america.popContinente());
        System.out.println("Dimensão do Continente: " + america.dimensaoContinente());
        System.out.println("Menor país do Continente: " + america.menorDim().getNome());
        System.out.println("Maior país do Continente: " + america.maiorDim().getNome());
        System.out.println("Densidade do Continente: " + america.densPop());


    }
}
