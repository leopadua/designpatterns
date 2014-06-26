package br.com.ChainofResponsibility.conta;


public class FormatoSeparadoPorVirgula implements Formato {

	private Formato proximo;
	
	@Override
	public String formato(Requisicao requisicao) {
		if(requisicao.getFormato().equals("CSV")){
			return "CSV";
		}
		else {
			return proximo.formato(requisicao);
		}		
	}

	@Override
	public void setProximo(Formato proximo) {
		this.proximo = proximo;
	}	
}
