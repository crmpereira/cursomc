package com.cesarpereira.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cesarpereira.cursomc.domain.Cliente;


public interface ClienteRepository  extends JpaRepository <Cliente,Integer> {

	
	
}

