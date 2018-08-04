package com.jackmoney.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackmoney.api.model.Lancamento;
import com.jackmoney.api.model.Pessoa;
import com.jackmoney.api.repository.LancamentoRepository;
import com.jackmoney.api.repository.PessoaRepository;
import com.jackmoney.api.service.exception.PessoaInexistenteOuInativaException;

//regra para não salvar pessoa inativa

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		return lancamentoRepository.save(lancamento);
	}

	
}
