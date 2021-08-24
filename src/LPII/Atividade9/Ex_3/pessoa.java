package LPII.Atividade9.Ex_3;

public class pessoa {
    public String nome;
    public pessoa pai;
    public pessoa mae;

    public pessoa(String nome, pessoa pai, pessoa mae){
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public boolean igual(pessoa outra){
        if(this.nome.equals(outra.nome) && this.mae == outra.mae){
            return true;
            }else{
            return false;
        }
    }

    public boolean irmao(pessoa outra){
        if(this.mae == outra.mae || this.pai == outra.pai){
            return true;
        }else{
            return false;
        }
    }

    public boolean antecessor(pessoa outra){
        boolean status = false;

        if (outra == this.mae || outra == this.pai){
            return true;
        }else{
            if (this.mae != null){
                status = this.mae.antecessor(outra);
            }
            if (this.pai != null && status == false){
                status = this.pai.antecessor(outra);
            }
        }
        return status;
    }
}
