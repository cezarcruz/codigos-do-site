package br.com.cezarcruz.mapstruct.controllers.mappers;

import br.com.cezarcruz.mapstruct.controllers.request.PessoaRequest;
import br.com.cezarcruz.mapstruct.controllers.response.PessoaResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
    EnderecoMapper.class
})
public interface PessoaMapper {
  PessoaResponse de(final PessoaRequest pessoaRequest);
}
