package com.cesarpereira.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesarpereira.cursomc.domain.Categoria;
import com.cesarpereira.cursomc.repositories.CategoriaRepository;
import com.cesarpereira.cursomc.service.exception.ObjetcNotFoundExecption;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id){
		Optional<Categoria> obj = repo.findById(id);
		
		if (obj == null ) {
			throw new ObjetcNotFoundExecption("Objeto nao encontrado" + id
						+ ",Tipo"+Categoria.class.getName());
		} 
		
		return obj.orElse(null);
					
	}
	
}
