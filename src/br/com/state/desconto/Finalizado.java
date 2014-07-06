package br.com.state.desconto;

import br.com.strategy.imposto.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento esta finalizado.");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento esta finalizado.");
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Orçamento esta finalizado.");		
	}

	@Override
	public void finalizado(Orcamento orcamento) {
		throw new RuntimeException("Orçamento esta finalizado.");		
	}

}
