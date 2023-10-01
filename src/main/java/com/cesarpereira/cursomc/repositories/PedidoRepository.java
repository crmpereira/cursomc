package com.cesarpereira.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cesarpereira.cursomc.domain.Pedido;


public interface PedidoRepository  extends JpaRepository <Pedido,Integer> {

	
	
}

