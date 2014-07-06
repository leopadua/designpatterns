package br.com.state.desconto;

import br.com.strategy.imposto.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento {

	private boolean descontoAplicado = false;
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoAplicado){
			orcamento.valor  -= orcamento.valor * 0.02;
			descontoAplicado = true;
		}else{
			throw new RuntimeException("Desconto j� aplicado!");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento ja esta em estado de aprovado");
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento esta em aprovado n�o pode ser reprovado.");
	}

	@Override
	public void finalizado(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}
}
