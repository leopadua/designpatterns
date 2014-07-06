package br.com.state.desconto;

import br.com.strategy.imposto.Orcamento;

public class TestesDoDescontoExtra {

	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500);
		
        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor());
        reforma.aprova();

        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor()); 
        
        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor());
        reforma.aprova();

        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor()); 
        reforma.finaliza();
	}
}
