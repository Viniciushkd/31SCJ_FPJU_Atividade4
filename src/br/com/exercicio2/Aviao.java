package br.com.exercicio2;

public class Aviao extends Thread {
	private String nomeVoo;
	private Aeroporto aeroporto;

	public Aviao(String nomeVoo, Aeroporto aeroporto) {
		this.nomeVoo = nomeVoo;
		this.aeroporto = aeroporto;
	}

	public String getNomeVoo() {
		return nomeVoo;
	}

	public void setNomeVoo(String nomeVoo) {
		this.nomeVoo = nomeVoo;
	}

	public Aeroporto getAeroporto() {
		return aeroporto;
	}

	public void setAeroporto(Aeroporto aeroporto) {
		this.aeroporto = aeroporto;
	}

	public void decolar() {
		this.aeroporto.aguardarPistaDisponivel();
		System.out.println(nomeVoo + "Decolando...");
	}

	public void voar() {
		try {
			decolar();
			Thread.sleep(2000);
			aterrissar();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void aterrissar() {
		this.aeroporto.aguardarPistaDisponivel();
		System.out.println(nomeVoo + "Aterrissando...");
	}

	@Override
	public void run() {
		while(true) {
		voar();
		}
	}
}
