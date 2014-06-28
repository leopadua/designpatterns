package br.com.TemplateMethod.imposto;

import br.com.ChainofResponsibility.desconto.Item;
import br.com.strategy.imposto.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional {
	
	private boolean existeMaisDeUmaPalavra(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getNome().equals(item)) return true;
        }
        return false;
    }

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.01;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100.00;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return existeMaisDeUmaPalavra(orcamento);
	}
}
