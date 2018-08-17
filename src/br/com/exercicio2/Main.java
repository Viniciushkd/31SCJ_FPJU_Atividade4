package br.com.exercicio2;

public class Main {

	public static void main(String[] args) {
		Aeroporto aeroporto = new Aeroporto("Congonhas");
		new Thread(aeroporto).start();
		new Thread(new Aviao("TAN 123", aeroporto)).start();
		new Thread(new Aviao("OLÉ 111", aeroporto)).start();
		new Thread(new Aviao("LINHA 222", aeroporto)).start();
	}
}
