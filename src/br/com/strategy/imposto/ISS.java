package br.com.strategy.imposto;

public class ISS extends Imposto {

	public ISS(Imposto OutroImposto) {
		super(OutroImposto);
	}

	public ISS(){}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06+ calculoDoOutroImposto(orcamento);
	}
}
