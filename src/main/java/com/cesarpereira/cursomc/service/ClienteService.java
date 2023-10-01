package com.cesarpereira.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesarpereira.cursomc.domain.Cliente;
import com.cesarpereira.cursomc.repositories.ClienteRepository;
import com.cesarpereira.cursomc.service.exception.ObjetcNotFoundExecption;
///import com.cesarpereira.cursomc.service.exception.ObjetcNotFoundExecption;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id){
		Optional<Cliente> obj = repo.findById(id);
		
		if (obj == null ) {
			throw new ObjetcNotFoundExecption("Objeto nao encontrado" + id
						+ ",Tipo"+Cliente.class.getName());
		} 
		
		return obj.orElse(null);
					
	}
	
}
