package jana60.bank;

import java.util.Random;

public class Conto {

	
	private int numeroConto;
	private String nomeProprietario;
	private int saldo = 0;
	public char eur = '\u20ac';
	
	public Conto() {
		Random rnd = new Random();
		this.numeroConto = rnd.nextInt(90000) + 10000;
	}
	
// Getters e Setters nome proprietareio
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
		
	
// Getters saldo e conto
	public int getNumeroConto() {
		return numeroConto;
	}
	public int getSaldo() {
		return saldo;
	}

	
// Metodi prelievo e deposito 
	public void addMoney(int deposit) {
		this.saldo += deposit;
	}
	public void getMoney(int prelievo) {
		if (this.saldo - prelievo >= 0) {
			this.saldo -= prelievo;
		} else {
			System.out.println("Saldo non sufficiente");
		}
	}

	
	
	@Override
	public String toString() {
		return "Proprietario Conto: " + getNomeProprietario() +
				"\nNumero Conto: " + getNumeroConto() +
				"\nIl saldo attuale è di: " + getSaldo() + eur ;
	}
}

