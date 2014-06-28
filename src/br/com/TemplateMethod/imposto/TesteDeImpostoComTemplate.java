package br.com.TemplateMethod.imposto;

import br.com.strategy.imposto.CalculadorDeImposto;
import br.com.strategy.imposto.Imposto;
import br.com.strategy.imposto.Orcamento;

public class TesteDeImpostoComTemplate {
	
	public static void main(String[] args) {
		Imposto icpp = new ICPP();
		Imposto IKCV = new IKCV();
		
		Orcamento orcamento = new Orcamento(1500.00);
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		calculador.realizaCalculo(orcamento, icpp);
		calculador.realizaCalculo(orcamento, IKCV);
	}
}
