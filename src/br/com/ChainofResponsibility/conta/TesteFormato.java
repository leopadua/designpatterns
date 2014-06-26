package br.com.ChainofResponsibility.conta;

public class TesteFormato {
	
	public static void main(String[] args) {
		Requisicao requisicao = new Requisicao("CSV");
		
		VerificadorDeTipoDeConta verifica = new VerificadorDeTipoDeConta();
		
		String requisicaoFinal = verifica.VerificaFormato(requisicao);
		
		System.out.println(requisicaoFinal);
	}
}
