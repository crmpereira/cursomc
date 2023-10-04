package com.cesarpereira.cursomc.resources;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarpereira.cursomc.domain.Pedido;
import com.cesarpereira.cursomc.repositories.PedidoRepository;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {
	
	private PedidoRepository  categoriaRepository;
	
	public PedidoResource(PedidoRepository categoriaRepository) {
        super();
    	this.categoriaRepository = categoriaRepository;
    }
    
	
	@GetMapping	
	public List<Pedido> lista() {
		return categoriaRepository.findAll();       
    }
	
	
	@GetMapping("/{id}")
    public Pedido getPedidoById(@PathVariable Integer id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Pedido não encontrado"));
    }
	
	@PostMapping
    public Pedido Pedido (@RequestBody Pedido categoria) {
        return categoriaRepository.save(categoria);
    }
	
	@DeleteMapping("/{id}")
	public void deletePedido(@PathVariable Integer id) {
		categoriaRepository.deleteById(id);
	}
	
	

}
