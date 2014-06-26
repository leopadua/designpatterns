package br.com.ChainofResponsibility.conta;

public interface Formato {

	String formato(Requisicao requisicao);
	
	void setProximo(Formato proximo);
}
