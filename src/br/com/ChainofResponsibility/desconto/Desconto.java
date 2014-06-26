package br.com.ChainofResponsibility.desconto;

public interface Desconto {

	double desconto(Orcamento orcamento);
	
	void setProximo(Desconto proximo);
}
