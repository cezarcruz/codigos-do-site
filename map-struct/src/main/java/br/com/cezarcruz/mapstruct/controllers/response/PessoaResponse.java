package br.com.cezarcruz.mapstruct.controllers.response;

import java.util.List;

public class PessoaResponse {
  private String nome;
  private Integer idade;
  private List<EnderecoResponse> enderecos;

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

  public List<EnderecoResponse> getEnderecos() {
    return enderecos;
  }

  public void setEnderecos(final List<EnderecoResponse> enderecos) {
    this.enderecos = enderecos;
  }
}
