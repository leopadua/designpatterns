package br.com.designpatterns.investimento;

public class TesteDeInvestimento {
	
	public static void main(String[] args) {
		Investimento cons = new Arrojado();
		
		Conta conta = new Conta(100);
		
		RealizadorDeInvestimentos investimento = new RealizadorDeInvestimentos();
		investimento.RealizaCalculo(conta, cons);
	}
	
}
