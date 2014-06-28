package br.com.Decorator.imposto;

import br.com.strategy.imposto.Imposto;
import br.com.strategy.imposto.Orcamento;

public class ImpostoMuitoAlto extends Imposto{

	public ImpostoMuitoAlto(){}
	
	public ImpostoMuitoAlto(Imposto OutroImposto){
		super(OutroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calculoDoOutroImposto(orcamento);
	}
}
