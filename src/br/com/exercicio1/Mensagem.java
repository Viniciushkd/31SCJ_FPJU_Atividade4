package br.com.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Mensagem implements Runnable {

	private List<String> mensagens = new ArrayList<>();

	public Mensagem() {
		for (int i = 0; i <= 10; i++) {
			mensagens.add("Mensagem" + i);
		}
	}

	@Override
	public void run() {
		try {
			for (String mensagem : mensagens) {
				System.out.println(mensagem);
				Thread.sleep(20000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

