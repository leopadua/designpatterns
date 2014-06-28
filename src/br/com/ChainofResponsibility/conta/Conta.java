package br.com.ChainofResponsibility.conta;

public class Conta {

	private String nome;
	private double saldo;
	private String agencia;
	private String numero;



	public Conta(String nome, double saldo){
		this.nome = nome;
		this.saldo = saldo;
		
	}

	public String getNome() {
		return nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
