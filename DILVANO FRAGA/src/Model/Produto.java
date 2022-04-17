package Model;

//import Model.TipoProduto;
import java.util.Date;

public class Produto {
    public int codigo;
    public String descricao;
    public String marca;
    public float preco_compra;
    public float preco_venda;
    public Date data_valida;
    public int tipoProduto;
    public String cor;

    //GET
    public String getDescricao(){
        return descricao;
    }
    public String getMarca(){
        return marca;
    }
    public float getPreco_compra(){
        return preco_compra;
    }
    public float getPreco_venda(){
        return preco_venda;
    }
    public Date getData_validade(){
        return data_valida;
    }
    public int getTipoproduto(){
        return tipoProduto;
    }
    public String getCor(){
        return cor;
    }

    // SET
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setPreco_compra(Float preco_compra){
        this.preco_compra = preco_compra;
    }
    public void setPreco_vendas(Float preco_compra){
        this.preco_compra = preco_compra;
    }
    public void setData_validade(Date data_validade){
        this.data_valida = data_validade;
    }
    public void setTipoproduto(int tipoProduto){
        this.tipoProduto = tipoProduto;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
}
