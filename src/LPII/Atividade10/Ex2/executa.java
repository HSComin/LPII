package LPII.Atividade10.Ex2;

public class executa {
    public static void main(String[] args) {
        gerente g = new gerente();
        g.setNome("Rafael Consentino");
        g.setUsuario("rafael.consentino");
        g.setSalario(2000);
        g.setSenha("12345");

        telefonista t = new telefonista();
        t.setNome("Carolina Mello");
        t.setSalario(1000);
        t.setEsttrabalho(13);

        secretaria s = new secretaria();
        s.setNome("Tatiane Andrade");
        s.setRamal(198);
        s.setSalario(1500);

        g.imprimirg();
        t.imprimirt();
        s.imprimirs();
    }
}
