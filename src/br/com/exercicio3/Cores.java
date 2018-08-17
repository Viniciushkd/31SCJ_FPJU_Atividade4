package br.com.exercicio3;

public enum Cores {

	Branco("21", "Branco"), 
	Preto("22", "Preto"), 
	Vermelho("23", "Vermelho"), 
	Amarelo("24", "Amarelo"), 
	Azul("25", "Azul");

	private String id;
	private String nome;

	Cores(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public String recuperarNome() {
		return nome;
	}
	
	public String recuperarCodigo() {
		return id;
	}
}
