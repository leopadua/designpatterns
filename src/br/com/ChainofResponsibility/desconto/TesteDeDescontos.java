package br.com.ChainofResponsibility.desconto;

public class TesteDeDescontos {

	public static void main(String[] args) {
		CalculadorDeDesconto descontos = new CalculadorDeDesconto();
		
		Orcamento orcamento = new Orcamento(1000.00);
		orcamento.adicionaItem(new Item("CANETA", 50.00));
		orcamento.adicionaItem(new Item("LAPIS", 40.00));
		
		double descontoFinal = descontos.calcula(orcamento);
		
		System.out.println(descontoFinal);
	}
}
