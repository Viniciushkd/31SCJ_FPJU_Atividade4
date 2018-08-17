package br.com.exercicio1;

public class Main {
	public static void main(String args[]) {
		new Thread(new Controlador()).start();
	}
}

class Controlador implements Runnable {

	private Thread mensagem;
	private Thread datahora;

	public Controlador() {
		mensagem = new Thread(new Mensagem());
		datahora = new Thread(new DataHora());
	}

	@Override
	public void run() {
		try {
			mensagem.start();
			datahora.start();

			while (true) {
				System.out.println("Status da thread Mensagem: " + mensagem.getState());
				System.out.println("Status da thread Data e Hora: " + datahora.getState());
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
