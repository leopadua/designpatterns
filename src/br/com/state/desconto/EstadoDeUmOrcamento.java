package br.com.state.desconto;

import br.com.strategy.imposto.Orcamento;

public interface EstadoDeUmOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	
	void reprovado(Orcamento orcamento);
	
	void finalizado(Orcamento orcamento);
}
