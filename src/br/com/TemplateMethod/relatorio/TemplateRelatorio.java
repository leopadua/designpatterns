package br.com.TemplateMethod.relatorio;

import java.util.List;

import br.com.ChainofResponsibility.conta.Conta;

public abstract class TemplateRelatorio {

    protected abstract void cabecalho();
    protected abstract void rodape();
    protected abstract void corpo(List<Conta> contas);

    public void imprime(List<Conta> contas) {
      cabecalho();
      corpo(contas);
      rodape();
    }
}
