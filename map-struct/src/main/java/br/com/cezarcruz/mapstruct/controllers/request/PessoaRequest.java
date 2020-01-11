package br.com.cezarcruz.mapstruct.controllers.request;

import java.util.List;

public class PessoaRequest {
  private String nome;
  private Integer idade;
  private List<EnderecoRequest> enderecos;

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

  public List<EnderecoRequest> getEnderecos() {
    return enderecos;
  }

  public void setEnderecos(final List<EnderecoRequest> enderecos) {
    this.enderecos = enderecos;
  }
}
