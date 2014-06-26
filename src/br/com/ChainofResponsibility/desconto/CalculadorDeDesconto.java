package br.com.ChainofResponsibility.desconto;

public class CalculadorDeDesconto {
	
	public double calcula(Orcamento orcamento){
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentos();		
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d4);
		d3.setProximo(d3);
		
		return d1.desconto(orcamento);	
	}
}
