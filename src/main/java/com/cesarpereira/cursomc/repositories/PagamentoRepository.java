package com.cesarpereira.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cesarpereira.cursomc.domain.Pagamento;


public interface PagamentoRepository  extends JpaRepository <Pagamento,Integer> {

	
	
}

