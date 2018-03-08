package com.jackmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jackmoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
