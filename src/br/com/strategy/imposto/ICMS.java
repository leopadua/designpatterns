package br.com.strategy.imposto;

public class ICMS extends Imposto{

	public ICMS(Imposto OutroImposto) {
		super(OutroImposto);
	}
	
	public ICMS(){}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() *  0.05 + calculoDoOutroImposto(orcamento);
	}
}
