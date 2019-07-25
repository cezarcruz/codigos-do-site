package br.com.cezarcruz;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class PessoaLombok {

    private String nome;
    private Integer idade;

}
