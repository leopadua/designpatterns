package br.com.strategy.imposto;

public abstract class Imposto {

	
	private Imposto outroImposto;

	public Imposto(Imposto OutroImposto){
		this.outroImposto = OutroImposto;
	}
	
	public Imposto(){}
	
	public abstract double calcula(Orcamento orcamento);
	
    protected double calculoDoOutroImposto(Orcamento orcamento) {
    	if(outroImposto == null) return 0;
        return outroImposto.calcula(orcamento);
    }
}
