package garage;
import veicoli.*;


import java.util.Scanner;

public class Garage {

	Scanner input = new Scanner(System.in);

	private static VeicoloAMotore[] veicoli = new VeicoloAMotore[15];

	public Garage() {
		for(int i=0;i<15;i++) {
			veicoli[i]=null;
		}
	}

	public int immettiNuovoVeicolo() {
		int scelta,posto;
		boolean control=true;
		do {
			control=false;
			boolean control2=true;
			do {
				control2=false;
				System.out.println("In quale posto lo vuoi inserire(I posti vanno da 1 a 15 compresi)?");
				posto=input.nextInt();
					if(veicoli[posto-1]!=null) {
							System.out.println("Il posto è già occupato, reinseriscilo");
							control2=true;
					}
					else
						System.out.println("Il posto è libero");
					
				
			}while(control2);


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

				veicoli[posto-1]=new Furgone(anno,marca,alimentazione, cilind,cap);
				veicoli[posto-1].setNumPosto(posto);
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

				veicoli[posto-1]=new Automobile(anno2,marca2,alimentazione2, cilind2,num);
				veicoli[posto-1].setNumPosto(posto);
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

				veicoli[posto-1]=new Motocicletta(anno3,marca3,alimentazione3, cilind3,tempi,tipo);
				veicoli[posto-1].setNumPosto(posto);
				break;
			default:
				System.out.println("Valore immesso errato, riprova");
				control=true;
			}

		}while(control);

		System.out.println("Hai assegnato il veicolo alla postazione numero: "+ posto);
		return posto;
	}

	public void estraiVeicolo() {
		int posto=0;
		do {
			System.out.println("Inserisci numero posto oppure premi '0' per uscire: ");
			posto = input.nextInt();

			if(posto!=0) {

				if(veicoli[posto-1]==null)
					System.out.println("Non puoi estrarre alcun veicolo poichè il posto è libero");
				else
					System.out.println("Hai estratto il veicolo :" + veicoli[posto-1].toString()+" che si trovava al posto "+ posto);
			}

		} while(posto != 0);
	}

	public void stampaSituazionePosto() {
		boolean situa=true;
		int[] postDisp=new int[15];
		int j=0;
		for(int i=0;i<15;i++)
			if(veicoli[i]==null) {
				situa=false;
				postDisp[j]=i+1;
				j++;
			}
			else {
				System.out.println("Il posto "+(i+1)+" è occupato da:");
				System.out.println(veicoli[i].toString());
			}

		if(situa)
			System.out.println("Tutti i posti sono occpuati");
		else {
			System.out.println("Ci sono ancora posti disponibili");
			System.out.print("I posti disponibili sono:");
			for(int i=0;i<15 && !(postDisp[i]==0);i++)
				System.out.print(postDisp[i]+" ");
		}
		System.out.println("");
	}
}
