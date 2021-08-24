package LPII.Atividade9.Ex_3;

public class testepessoa {
    public static void main(String[] args) {

        pessoa p1 = new pessoa("Principe Philip", null, null);
        pessoa p2 = new pessoa("Rainha Elizabeth", null, null);

        pessoa p4 = new pessoa("Principe Charles", p1, p2);
        pessoa p5 = new pessoa("Princesa Diana", null, null);

        pessoa p6 = new pessoa("Principe William", p1, p2);
        pessoa p7 = new pessoa("Principe Harry", p1, p2);
        pessoa p8 = new pessoa("Kate", null, null);
        pessoa p9 = new pessoa("Megan", null, null);

        pessoa p10 = new pessoa("Principe George", p6, p8);
        pessoa p11 = new pessoa("Princesa Charlote", p6, p8);
        pessoa p12 = new pessoa("Principe Louis", p6, p8);
        pessoa p13 = new pessoa("Archie", p7, p9);

        System.out.println("Principe William é irmão do principe Harry? " +p6.irmao(p7));
        System.out.println("Rainha Elisabeth é ancestral do Principe Charles? " +p4.antecessor(p2));
        System.out.println("Principe Harry é ancestral do Principe Louis? " +p12.antecessor(p7));

    }
}
