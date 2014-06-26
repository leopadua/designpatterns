package br.com.strategy.investimento;

import java.util.Random;

public class Arrojado implements Investimento{

	@Override
	public double calcula(Conta conta) {
		Random rdn = new Random();
		if(rdn.nextDouble() < 0.20)
			return conta.getValor() * 0.05;
		else if (rdn.nextDouble() > 0.20 && rdn.nextDouble() < 0.50)
			return conta.getValor() * 0.03;
		else 
			return conta.getValor() * 0.6;
		
	}
}
