package br.edu.ifms.Detran.service;

import br.edu.ifms.Detran.dto.CarroDto;
import br.edu.ifms.Detran.dto.InfracaoDto;
import br.edu.ifms.Detran.model.Carro;
import br.edu.ifms.Detran.model.Infracao;

public class InfracaoService {

	public Infracao fromDto(InfracaoDto objDto) {
		return new Infracao(objDto.getId(), objDto.getDescricao(), objDto.getPontos(), objDto.getValor());
	}
}
