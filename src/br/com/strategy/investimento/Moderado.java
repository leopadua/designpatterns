package br.com.strategy.investimento;

import java.util.Random;

public class Moderado implements Investimento{

	@Override
	public double calcula(Conta conta) {
		Random rdn = new Random();
		if(rdn.nextDouble() > 0.50)
			return conta.getValor() * 2.5;
		else
			return conta.getValor() * 0.7;
	}

}
