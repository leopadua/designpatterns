package br.com.ChainofResponsibility.conta;

public class FormatoDePorcentagem implements Formato{
	
	private Formato proximo;

	@Override
	public String formato(Requisicao requisicao) {
		if(requisicao.getFormato().equals("%")){
			return "%";
		}
		else{
			return proximo.formato(requisicao);
		}
	}

	@Override
	public void setProximo(Formato proximo) {
		this.proximo = proximo;
	}	
	
}
