package com.cesarpereira.cursomc.domain;

import com.cesarpereira.cursomc.domain.enums.EstadoPagamento;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table (name = "pagamento_com_cartao", schema = "public")
public class PagamentoComCartao extends Pagamento{

	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas =  numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
	
}
