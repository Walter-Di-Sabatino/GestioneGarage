package veicoli;

public class Automobile extends VeicoloAMotore{
	
	private int numPorte;
	
	public Automobile(int annoImmatricolazione, String marca, String alimentazione, int cilindrata, int numPorte) {
		super(annoImmatricolazione, marca, alimentazione, cilindrata);
		
		this.numPorte = numPorte;
	}
	
	public int getNumPorte() {
		return numPorte;
	}
	
	public void setNumPorte(int numPorte) {
		this.numPorte = numPorte;
	}
	
	public String toString() {
		return "Automobile" + getMarca() + " " + getAnnoImmatricolazione() + " alimentato a "+ getAlimentazione() + " cilindrata "  + getCilindrata() + " con numero porte pari a " + getNumPorte();
	}
}
