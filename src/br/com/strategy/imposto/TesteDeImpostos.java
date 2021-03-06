package br.com.strategy.imposto;

public class TesteDeImpostos {
	
	public static void main(String[] args) {
		Imposto iss = new ISS(null);
		Imposto icms = new ICMS(null);
		Imposto iccc = new ICCC(null);
		
		Orcamento orcamento = new Orcamento(3004.00);
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iccc);
		
	}
}
