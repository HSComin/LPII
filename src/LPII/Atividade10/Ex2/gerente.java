package LPII.Atividade10.Ex2;

public class gerente extends funcionario{
    private String usuario;
    private String senha;

    public double calculaBonificacao(){
        return this.getSalario() * 0.6 + 100;
    }

    public void imprimirg(){
        System.out.println("Dados do Gerente");
        this.imprimir();

        System.out.println("Usuario: " + getUsuario());
        System.out.println("Senha: " + getSenha());
        System.out.println("Bonificacao: " + calculaBonificacao());
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
