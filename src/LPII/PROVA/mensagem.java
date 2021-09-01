package LPII.PROVA;

public class mensagem {

    private String titulo;
    private String conteudo;

    public mensagem(String titulo, String conteudo){
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }

    public String toString(){
        return "  " + this.titulo + " -  " + this.conteudo;
    }
}
