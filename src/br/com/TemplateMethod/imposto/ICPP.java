package br.com.TemplateMethod.imposto;

import br.com.strategy.imposto.Imposto;
import br.com.strategy.imposto.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional{
	
	public ICPP(Imposto OutroImposto){
		super(OutroImposto);
	}
	
	public ICPP(){}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}
}
