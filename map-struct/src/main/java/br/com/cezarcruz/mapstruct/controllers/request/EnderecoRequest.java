package br.com.cezarcruz.mapstruct.controllers.request;

public class EnderecoRequest {
  private String rua;
  private Integer numero;
  private String cidade;

  public String getRua() {
    return rua;
  }

  public void setRua(final String rua) {
    this.rua = rua;
  }

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(final Integer numero) {
    this.numero = numero;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(final String cidade) {
    this.cidade = cidade;
  }
}
