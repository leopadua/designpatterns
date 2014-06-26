package br.com.ChainofResponsibility.conta;

public class FormatoXML implements Formato{

	private Formato proximo;
	
	@Override
	public String formato(Requisicao requisicao) {
		if(requisicao.getFormato().equals("xml")){
			return "XML";
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
