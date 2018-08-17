package br.com.exercicio2;

public class Aeroporto extends Thread {

	private String nomeAeroporto;
	private boolean statuPista;

	public Aeroporto(String nomeAeroporto) {
		this.nomeAeroporto = nomeAeroporto;
	}
	
	public String getNomeAeroporto() {
		return nomeAeroporto;
	}
	public void setNomeVoo(String nomeAeroporto) {
		this.nomeAeroporto = nomeAeroporto;
	}
	public boolean isStatuPista() {
		return statuPista;
	}
	public void setStatuPista(boolean statuPista) {
		this.statuPista = statuPista;
	}

	public void aguardarPistaDisponivel() {
		if (this.statuPista) {
			System.out.println("\n ->Pista disponivel\n");
		}
	}

	public void alterarEstadoPista(boolean statuPista) {
		try {
			Thread.sleep(3000);
			this.statuPista = statuPista;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while(true) {
			alterarEstadoPista(this.isStatuPista() ? false : true);
		}
	}
}

