package model;

public class TPessoa {

  // Atributos

  private int id;
  private String tipo;
  private String nome;

  // Metodos

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public TPessoa(int id, String tipo, String nome) {
    this.id = id;
    this.tipo = tipo;
    this.nome = nome;

  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "TipoPessoa [id=" + id + ", nome=" + nome + ", tipo=" + tipo + "]";
  }

  public int getId() {
    return id;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }
}
