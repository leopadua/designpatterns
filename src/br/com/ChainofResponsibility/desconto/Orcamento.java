package br.com.ChainofResponsibility.desconto;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private final double valor;
	private final List<Item> itens;

	public Orcamento(double valor){
		this.valor = valor;
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
}
