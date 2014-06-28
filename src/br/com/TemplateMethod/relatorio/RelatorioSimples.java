package br.com.TemplateMethod.relatorio;

import java.util.List;

import br.com.ChainofResponsibility.conta.Conta;

public class RelatorioSimples extends TemplateRelatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
	}

	@Override
	protected void rodape() {
		System.out.println("(11) 1234-5678");
	}

	@Override
	protected void corpo(List<Conta> contas) {
	     for(Conta c : contas) {
	          System.out.println( c.getNome() + " - " + c.getSaldo() );
	     }
	}

}
