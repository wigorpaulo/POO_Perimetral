package model;

public class TipoProduto {


    private int id;
    private String descricao;

    //get
    public int getId() {
        return id;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setId(int id) {
        this.id = id;
    }
}
