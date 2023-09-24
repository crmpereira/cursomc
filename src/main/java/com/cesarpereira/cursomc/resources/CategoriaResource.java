package com.cesarpereira.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarpereira.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@GetMapping
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Informatica");
		Categoria cat2 = new Categoria(2, "Escritorio");
		Categoria cat3 = new Categoria(3, "Eletronicos");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat3);
		lista.add(cat2);
		
		return lista;
		
	}
	

}
