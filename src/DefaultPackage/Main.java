package DefaultPackage;
import java.util.Scanner;


import garage.*;
import veicoli.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//VeicoloAMotore[] veicoli = new VeicoloAMotore[15];
		Garage garage = new Garage();
		
		int scelta;
		do {
			System.out.println("MENU");
			System.out.println("0) Per uscire");
			System.out.println("1) Inserimento di un veicolo");
			System.out.println("2) Per liberare un posto");
			System.out.println("3) Situazione posti disponibili");
			System.out.print("Scelta: ");
			scelta = input.nextInt();
			
			switch(scelta) {
			case 0:
				System.out.println("Arrivederci!");
				return;
			case 1:
				garage.immettiNuovoVeicolo();
				break;
			case 2:
				garage.estraiVeicolo();
				break;
			case 3:
				garage.stampaSituazionePosto();
				break;
				default:
					System.out.println("Carattere non consentito, riprova");
			}
		}while(scelta != 0);

	}

}
