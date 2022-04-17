package Model;

public class TipoPessoa {
    public int id;
    public String descricao;

    //GET
    public String getDescricao(){
        return descricao;
    }

    //SET 
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
