package br.com.cezarcruz.mapstruct.controllers.response;

public class EnderecoResponse {
  private String logradouro;
  private String numero;
  private String cidade;

  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(final String logradouro) {
    this.logradouro = logradouro;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(final String numero) {
    this.numero = numero;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(final String cidade) {
    this.cidade = cidade;
  }
}
