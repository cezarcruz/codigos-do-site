package br.com.cezarcruz.mapstruct.controllers;

import br.com.cezarcruz.mapstruct.controllers.mappers.PessoaMapper;
import br.com.cezarcruz.mapstruct.controllers.request.PessoaRequest;
import br.com.cezarcruz.mapstruct.controllers.response.PessoaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConversorService {

  @Autowired
  private PessoaMapper pessoaMapper;

  public PessoaResponse converte(final PessoaRequest pessoaRequest) {
    return pessoaMapper.de(pessoaRequest);
  }
}
