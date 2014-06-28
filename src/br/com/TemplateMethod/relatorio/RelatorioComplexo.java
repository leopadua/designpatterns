package br.com.TemplateMethod.relatorio;

import java.util.Calendar;
import java.util.List;

import br.com.ChainofResponsibility.conta.Conta;

public class RelatorioComplexo extends TemplateRelatorio{

	@Override
	protected void cabecalho() {
	      System.out.println("Banco XYZ");
	      System.out.println("Avenida Paulista, 1234");
	      System.out.println("(11) 1234-5678");
	}

	@Override
	protected void rodape() {
		System.out.println("banco@xyz.com.br");
	    System.out.println(Calendar.getInstance().getTime());  
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for(Conta c : contas) {
			System.out.println( c.getNome() + " - " + c.getNumero() + " - " + c.getAgencia() + " - " + c.getSaldo() );
		}
	}
}
