package br.com.Decorator.imposto;

import br.com.TemplateMethod.imposto.ICPP;
import br.com.strategy.imposto.ICMS;
import br.com.strategy.imposto.ISS;
import br.com.strategy.imposto.Imposto;
import br.com.strategy.imposto.Orcamento;

public class TesteDeImpostoComplexo {

	public static void main(String[] args) {
		Imposto iss = new ICPP(new ImpostoMuitoAlto());
		
		Orcamento orcamento = new Orcamento(123.00);
		
		double valorImposto = iss.calcula(orcamento);
		
		System.out.println(valorImposto);
	}
}
