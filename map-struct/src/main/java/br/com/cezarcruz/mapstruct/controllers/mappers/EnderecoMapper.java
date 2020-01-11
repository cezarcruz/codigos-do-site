package br.com.cezarcruz.mapstruct.controllers.mappers;

import br.com.cezarcruz.mapstruct.controllers.request.EnderecoRequest;
import br.com.cezarcruz.mapstruct.controllers.response.EnderecoResponse;
import java.util.List;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EnderecoMapper {

  @Mapping(target = "logradouro", source = "rua")
  EnderecoResponse de(final EnderecoRequest enderecoRequest);

  @InheritInverseConfiguration
  EnderecoRequest de(final EnderecoResponse enderecoResponse);

  List<EnderecoResponse> deRequest(final List<EnderecoRequest> enderecoRequests);

  @InheritConfiguration
  List<EnderecoRequest> deResponse(final List<EnderecoResponse> enderecoResponses);
}
