package com.cesarpereira.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cesarpereira.cursomc.domain.Cidade;


public interface CidadeRepository  extends JpaRepository <Cidade,Integer> {

	
	
}

