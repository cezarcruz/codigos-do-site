package br.com.cezarcruz.mapstruct.controllers.response;

import br.com.cezarcruz.mapstruct.controllers.request.EnderecoRequest;

public class PessoaResponse {
  private String nome;
  private Integer idade;
  private EnderecoResponse endereco;

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

  public EnderecoResponse getEndereco() {
    return endereco;
  }

  public void setEndereco(final EnderecoResponse endereco) {
    this.endereco = endereco;
  }
}
