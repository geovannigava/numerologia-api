package com.exemplo.numerologiaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.numerologiaapi.model.Lancamento;
import com.exemplo.numerologiaapi.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
