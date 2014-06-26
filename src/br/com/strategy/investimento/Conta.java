package br.com.strategy.investimento;

public class Conta {
	
	private double valor;

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public Conta(double valor)
	{
		this.valor = valor;
	}
}
