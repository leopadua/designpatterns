package br.com.strategy.investimento;

public class RealizadorDeInvestimentos {
	
	public void RealizaCalculo(Conta conta, Investimento investimento){
		double valoInvestimento = conta.getValor() + (investimento.calcula(conta) * 0.75);
		conta.setValor(valoInvestimento);
		System.out.println(conta.getValor());
	}
}
