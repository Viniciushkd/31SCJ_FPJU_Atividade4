package br.com.exercicio1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora implements Runnable {

	private DateTimeFormatter dtFormatter;

	public DataHora() {
		dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
	}

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(LocalDateTime.now().format(dtFormatter));
				Thread.sleep(10000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
