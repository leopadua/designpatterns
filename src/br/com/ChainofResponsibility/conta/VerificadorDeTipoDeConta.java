package br.com.ChainofResponsibility.conta;


public class VerificadorDeTipoDeConta {
	
	public String VerificaFormato(Requisicao requisicao){
		Formato f1 = new FormatoSeparadoPorVirgula();
		Formato f2 = new FormatoXML();
		Formato f3 = new FormatoInvalido();
		
		f1.setProximo(f2);
		f2.setProximo(f3);
		
		return f1.formato(requisicao);
	}
}
