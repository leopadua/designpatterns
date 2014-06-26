package br.com.strategy.imposto;

public class CalculadorDeImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto){
		double valorImposto = imposto.calcula(orcamento);
		System.out.println(valorImposto);
	}
}
