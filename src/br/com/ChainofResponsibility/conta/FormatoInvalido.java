package br.com.ChainofResponsibility.conta;

public class FormatoInvalido implements Formato{

	@Override
	public String formato(Requisicao requisicao) {
		
		return null;
	}

	@Override
	public void setProximo(Formato proximo) {
		
	}
}
