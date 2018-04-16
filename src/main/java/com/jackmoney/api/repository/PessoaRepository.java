package com.jackmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jackmoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
