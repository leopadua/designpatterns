package br.com.state.conta;

import br.com.ChainofResponsibility.conta.Conta;

public interface EstadoDaConta {

    void saca(Conta conta, double valor);
    void deposita(Conta conta, double valor);
}
