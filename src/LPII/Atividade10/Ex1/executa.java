package LPII.Atividade10.Ex1;

public class executa {
    public static void main(String[] args) {
        aluno al = new aluno("Henrique Schroder Comin", 20, 457896325);
        docente doc = new docente("João Cardoso Palma Filho", 69, 789654852, "Artes");
        tae ta = new tae("Américo N. Amorim", 41, "Escribo Play");

        al.imprimir();
        doc.imprimir();
        ta.imprimir();

        escola esc = new escola();

        esc.addpessoa(al);
        esc.addpessoa(doc);
        esc.addpessoa(ta);
        esc.imprimir();
    }
}
