package com.cesarpereira.cursomc.resources;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarpereira.cursomc.domain.Categoria;
import com.cesarpereira.cursomc.repositories.CategoriaRepository;


@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	
	
	private CategoriaRepository  categoriaRepository;
	
	public CategoriaResource(CategoriaRepository categoriaRepository) {
        super();
    	this.categoriaRepository = categoriaRepository;
    }
    
	
	@GetMapping	
	public List<Categoria> lista() {
		return categoriaRepository.findAll();       
    }
	
	
	@GetMapping("/{id}")
    public Categoria getCategoriaById(@PathVariable Integer id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Categoria não encontrado"));
    }
	
	@PostMapping
    public Categoria Categoria (@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
	
	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable Integer id) {
		categoriaRepository.deleteById(id);
	}
	
	

}
