package jana60.bank;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Per aprire un conto inserisci il tuo nome");
		Scanner scn = new Scanner(System.in);
		String nomeProprietrario = scn.nextLine();
		Conto conto = new Conto();
		conto.setNomeProprietario(nomeProprietrario);
		System.out.println(conto);
		System.out.println("\n---------------------------\n");
		System.out.println("Quale operazione vuoi eseguire? (prelievo/deposito)");
		String operation = scn.nextLine(); 

			System.out.println("----------------");
			System.out.println("Inserisci cifra da depositare");
			int deposit = scn.nextInt();
			conto.addMoney(deposit);
			System.out.println("Operazione completata, saldo attuale: " + conto.getSaldo() + conto.eur);

			System.out.println("Inserisci cifra da prelevare");
			int prelievo = scn.nextInt();
			conto.getMoney(prelievo);
			System.out.println("Operazione completata, saldo attuale: " + conto.getSaldo() + conto.eur);
		
		scn.close();
	}
}
