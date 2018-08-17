package br.com.exercicio3;

public class Main {

	public static void main(String[] args) {
		for (Cores cor : Cores.values()) {
		      System.out.println(cor.recuperarNome() + ": " + cor.recuperarCodigo());
		  }
		System.out.println("Codigo da cor branca: " + Cores.Branco.recuperarCodigo());
	}
}
