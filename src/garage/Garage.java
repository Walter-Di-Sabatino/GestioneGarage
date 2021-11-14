package garage;
import veicoli.*;


import java.util.Scanner;

public class Garage {

	Scanner input = new Scanner(System.in);

	public static VeicoloAMotore[] veicoli = new VeicoloAMotore[15];
	public static int indice = 0;
	private int numPostazione = 1000;

	public int immettiNuovoVeicolo(VeicoloAMotore v) {
		int scelta;
		do {
			System.out.println("Inserisci tipologia veicolo:");
			System.out.println("1-Furgone, 2-Automobile, 3-Motocicletta");
			scelta = input.nextInt();

			switch(scelta) {
			case 1:
				System.out.println("Inserisci marca veicolo: ");
				String marca = input.nextLine();
				input.next();
				System.out.println("Inserisci anno immatricolazione: ");
				int anno = input.nextInt();
				System.out.println("Inserisci tipo alimentazione: ");
				String alimentazione = input.nextLine();
				input.next();
				System.out.println("Inserisci cilindrata: ");
				int cilind = input.nextInt();
				System.out.println("Inserisci capacità carico: ");
				int cap = input.nextInt();
				
				veicoli[indice].setAlimentazione(alimentazione);
				veicoli[indice].setAnnoImmatricolazione(anno);
				veicoli[indice].setCilindrata(cilind);
				veicoli[indice].setMarca(marca);
				veicoli[indice].setNumPosto(++numPostazione);
				indice++;
				break;
			case 2:
				System.out.println("Inserisci marca veicolo: ");
				String marca2 = input.nextLine();
				input.next();
				System.out.println("Inserisci anno immatricolazione: ");
				int anno2 = input.nextInt();
				System.out.println("Inserisci tipo alimentazione: ");
				String alimentazione2 = input.nextLine();
				input.next();
				System.out.println("Inserisci cilindrata: ");
				int cilind2 = input.nextInt();
				System.out.println("Inserisci numero porte: ");
				int num = input.nextInt();

				veicoli[indice].setAlimentazione(alimentazione2);
				veicoli[indice].setAnnoImmatricolazione(anno2);
				veicoli[indice].setCilindrata(cilind2);
				veicoli[indice].setMarca(marca2);
				veicoli[indice].setNumPosto(++numPostazione);
				indice++;
				break;
			case 3:
				System.out.println("Inserisci marca veicolo: ");
				String marca3 = input.nextLine();
				input.next();
				System.out.println("Inserisci anno immatricolazione: ");
				int anno3 = input.nextInt();
				System.out.println("Inserisci tipo alimentazione: ");
				String alimentazione3 = input.nextLine();
				input.next();
				System.out.println("Inserisci cilindrata: ");
				int cilind3 = input.nextInt();
				System.out.println("Inserisci tempi motore: ");
				int tempi = input.nextInt();
				System.out.println("Inserisci tipologia: ");
				int tipo = input.nextInt();

				veicoli[indice].setAlimentazione(alimentazione3);
				veicoli[indice].setAnnoImmatricolazione(anno3);
				veicoli[indice].setCilindrata(cilind3);
				veicoli[indice].setMarca(marca3);
				veicoli[indice].setNumPosto(++numPostazione);
				indice++;
				break;
			default:
				System.out.println("Valore immesso errato, riprova");
			}
		}while(scelta != 1 || scelta != 2 || scelta != 3);

		System.out.println("Le verrà assegnata la postazione numero: ");
		return numPostazione;
	}

	public VeicoloAMotore estraiVeicolo(int posto) {
		do {
			System.out.println("Inserisci numero posto oppure premi '0' per uscire: ");
			posto = input.nextInt();

			for(int i = 0; i < veicoli.length; i++) {
				if(veicoli[i].getNumPosto() == posto) {
					System.out.println("Hai rimosso: ");
					return veicoli[i];
					//System.out.println(veicoli[i].getMarca() + " "+ veicoli[i].getAlimentazione() + " "+ veicoli[i].getAnnoImmatricolazione() + " "+ veicoli[i].getCilindrata());
				}
			}

		} while(posto != 0);
		return null;
	}
	
	public void stampaSituazionePosto() {
		if(veicoli.length < 15)
			System.out.println("Ci sono ancora posti disponibili, procedi");
		else
			System.out.println("Mi dispiace, posti esauriti");
	}
}
