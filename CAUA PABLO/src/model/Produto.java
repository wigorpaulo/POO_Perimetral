package model;
import java.util.Date;
public class Produto {

    private int String;
    private String descricao;
    private String marca;
    private float precoCompra;
    private float precoVenda;
    private Date dataValidade;
    private int tipoProduto;
    private String cor;
    private java.lang.String codigo;

    //Get
    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMarca() {
        return marca;
    }

    public float getPreco_compra() {
        return precoCompra;
    }

    public void setPreco_venda(float preco_venda) {
        this.precoVenda = preco_venda;
    }

    public void setData_validade(Date data_validade) {
        this.dataValidade = data_validade;
    }

    public int getTipoProduto() {
        return tipoProduto;
    }

    public String getCor() {
        return cor;
    }
//Set
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTipoProduto(int tipoProduto) {
        this.tipoProduto = tipoProduto;
    }





}
