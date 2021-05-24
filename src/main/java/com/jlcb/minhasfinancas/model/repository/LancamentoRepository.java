package com.jlcb.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlcb.minhasfinancas.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}