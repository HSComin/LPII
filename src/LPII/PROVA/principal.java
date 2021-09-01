package LPII.PROVA;

public class principal {
    public static void main(String[] args) {
        editor ed1 = new editor("Robótica");
        docente doc1 = new docente("Tiago");
        aluno alu1 = new aluno("Maria");

        ed1.cadastrarSeguidor(doc1);
        ed1.cadastrarSeguidor(alu1);

        mensagem msg = new mensagem("Hello", "Hello World");

        ed1.enviarMensagem(msg);
    }
}
