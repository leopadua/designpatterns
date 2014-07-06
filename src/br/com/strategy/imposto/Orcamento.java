package br.com.strategy.imposto;

import java.util.ArrayList;
import java.util.List;

import br.com.ChainofResponsibility.desconto.*;
import br.com.state.desconto.EmAprovacao;
import br.com.state.desconto.EstadoDeUmOrcamento;

public class Orcamento {

	public double valor;
	public EstadoDeUmOrcamento estadoAtual;
	private final List<Item> itens;

	public Orcamento(double valor){
		this.valor = valor;
		this.estadoAtual = new EmAprovacao();
		itens = new ArrayList<Item>();
	}

	public List<Item> getItens() {
		return java.util.Collections.unmodifiableList(itens);
	}

	public double getValor() {
		return valor;
	}
	
	public void adicionaItem(Item item)
	{
		itens.add(item);
	}
	
    public void aplicaDescontoExtra() {
    	estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova() {
    	estadoAtual.aprova(this);
    }

    public void reprova() {
    	estadoAtual.reprovado(this);
    }

    public void finaliza() {
    	estadoAtual.finalizado(this);
    }
}

