package org.lessons.java;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = null;

		try {

			Evento e1 = new Evento("Animaliamo", "29/09/2023", 3000);
			Evento e2 = new Evento("Milan Games Week", "29/09/2023", 10000);
			Evento e3 = new Evento("Milan Fashion week", "30/09/2023", 5000);

			Concerto c1 = new Concerto("Concerto Weeknd", "29/09/2023", 10000, "21:00", new BigDecimal(35));
			Concerto c2 = new Concerto("Concerto Gaga", "30/09/2023", 10000, "21:00", new BigDecimal(50));

			Spettacolo s1 = new Spettacolo("La città incantata, il Musical", "29/09/2023", 1000, new BigDecimal(40));
			Spettacolo s2 = new Spettacolo("Frozen on Ice", "30/09/2023", 1000, new BigDecimal(70.5));

			ProgrammaEventi pe = new ProgrammaEventi("Titolo serie");

			pe.addEvento(e1);
			pe.addEvento(e3);
			pe.addEvento(e2);

			pe.addEvento(c1);
			pe.addEvento(c2);

			pe.addEvento(s1);
			pe.addEvento(s2);

			System.out.println(pe);

			System.out.println("Media prezzo concerto: " + pe.mediaPrezzoConcerto());
			System.out.println("Media prezzo spettacolo: " + pe.mediaPrezzoSpettacolo());
			System.out.println("Media prezzo eventi: " + pe.mediaPrezzoEvento());
			
			  // da qui si commenta la parte delle prime 3 milestone per far funzionare m4 e m5

//  			System.out.println("Numero eventi: " + pe.getNumeroEventi());
//
//  			List<Evento> eventi29 = pe.getEventiByDate("29/09/2023");
//  			System.out.println(eventi29);
//
//  			Concerto c3 = new Concerto(
//  					"mio titolo", "29/09/2023", 100,
//  					LocalTime.parse("21:00"), new BigDecimal(35)
//  			);
//  
//  			System.out.println(c3);
//  			System.out.println("\n----------------------------------------------\n");
//  
//  			System.out.println("Prezzo: " + c3.getFormattedPrezzo());
//
//  			sc = new Scanner(System.in);
//  
//  			System.out.println("Nuovo evento:");
//  
//  			System.out.print("titolo: ");
//  			String title = sc.nextLine();
//  
//  			System.out.print("date: ");
//  			String date = sc.nextLine();
//  
//  			System.out.print("numero posti totali: ");
//  			int numeroPosti = Integer.valueOf(sc.nextLine());
//  
//  			Evento e4 = new Evento(title, date, numeroPosti);
//  
//  			System.out.println(e4);
//  			System.out.println("\n----------------------------------------------\n");
//  
//  			System.out.print("prenotazioni da effettuare: ");
//  			int prenotazioniDaEffettuare = Integer.valueOf(sc.nextLine());
//  
//  			for (int x=0;x<prenotazioniDaEffettuare;x++)
//  				e4.prenota();
//  
//  			System.out.println("Posti totali: " + e4.getPostiTotali());
//  			System.out.println("Posti prenotati: " + e4.getPostiPrenotati());
//  			System.out.println("\n----------------------------------------------\n");
//  
//  			System.out.print("disdette da effettuare: ");
//  			int disdetteDaEffettuare = Integer.valueOf(sc.nextLine());
//  
//  			for (int x=0;x<disdetteDaEffettuare;x++)
//  				e4.disdici();
//  
//  			System.out.println("Posti totali: " + e4.getPostiTotali());
//  			System.out.println("Posti prenotati: " + e4.getPostiPrenotati());
//  			System.out.println("\n----------------------------------------------\n");
//
//  			Evento e5 = new Evento("Mio evento", "2023-09-29", 100);
//  			System.out.println(e5);
//  			System.out.println("\n----------------------------------------------\n");
//  
//  			System.out.println("Posti totali: " + e5.getPostiTotali());
//  			System.out.println("Posti prenotati: " + e5.getPostiPrenotati());
//  			System.out.println("\n----------------------------------------------\n");
//  
//  			e5.prenota();
//  
//  			System.out.println("Posti totali: " + e5.getPostiTotali());
//  			System.out.println("Posti prenotati: " + e5.getPostiPrenotati());
//  			System.out.println("\n----------------------------------------------\n");
//  
//  			e5.disdici();
//  
//  			System.out.println("Posti totali: " + e5.getPostiTotali());
//  			System.out.println("Posti prenotati: " + e5.getPostiPrenotati());
//  			System.out.println("\n----------------------------------------------\n");
//  
//  			e5.disdici();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		} finally {

			if (sc != null)
				sc.close();
		}
	}
}

