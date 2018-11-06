package com.exemplo.numerologiaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.numerologiaapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
