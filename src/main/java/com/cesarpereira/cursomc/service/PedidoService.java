package com.cesarpereira.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesarpereira.cursomc.domain.Pedido;
import com.cesarpereira.cursomc.repositories.PedidoRepository;
import com.cesarpereira.cursomc.service.exception.ObjetcNotFoundExecption;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id){
		Optional<Pedido> obj = repo.findById(id);
		
		if (obj == null ) {
			throw new ObjetcNotFoundExecption("Objeto nao encontrado" + id
						+ ",Tipo"+Pedido.class.getName());
		} 
		
		return obj.orElse(null);
					
	}
	
}
