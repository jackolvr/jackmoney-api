package com.jackmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jackmoney.api.model.Lancamento;
import com.jackmoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}