package br.com.state.conta;

import br.com.ChainofResponsibility.conta.Conta;

public class Negativo implements EstadoDaConta{

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Sua conta est� no vermelho. N�o � poss�vel sacar!");
	}

	@Override
	public void deposita(Conta conta, double valor) {
        conta.saldo += valor * 0.95;
        if(conta.saldo > 0) conta.estado = new Positivo();
	}
}
