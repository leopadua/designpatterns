package br.com.strategy.investimento;

public class Conservador implements Investimento {

	@Override
	public double calcula(Conta conta) {
		return conta.getValor() * 0.08;
	}

}
