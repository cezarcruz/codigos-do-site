package br.com.cezarcruz.mapstruct.controllers.request;

public class PessoaRequest {
  private String nome;
  private Integer idade;
  private EnderecoRequest endereco;

  public String getNome() {
    return nome;
  }

  public void setNome(final String nome) {
    this.nome = nome;
  }

  public Integer getIdade() {
    return idade;
  }

  public void setIdade(final Integer idade) {
    this.idade = idade;
  }

  public EnderecoRequest getEndereco() {
    return endereco;
  }

  public void setEndereco(final EnderecoRequest endereco) {
    this.endereco = endereco;
  }
}
