package com.exemplo.numerologiaapi.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.exemplo.numerologiaapi.model.Lancamento;
import com.exemplo.numerologiaapi.repository.filter.LancamentoFilter;
import com.exemplo.numerologiaapi.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);

	
}
