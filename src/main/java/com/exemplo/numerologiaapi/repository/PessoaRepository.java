package com.exemplo.numerologiaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.numerologiaapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
