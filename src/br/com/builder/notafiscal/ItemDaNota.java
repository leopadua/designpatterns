package br.com.builder.notafiscal;

public class ItemDaNota {

	private String nome;
	private double valor;
	public ItemDaNota(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public double getValor() {
		return valor;
	}
	
	public ItemDaNota nome(String nome){
		this.nome = nome;
		return this;
	}
	
	public ItemDaNota valor(double valor){
		this.valor = valor;
		return this;
	}
	
    public ItemDaNota controiItem() {
        return new ItemDaNota(nome, valor);
    }
}
