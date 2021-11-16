package veicoli;

public class Furgone extends VeicoloAMotore{
	
	private int capacitaCarico;
	
	public Furgone(int annoImmatricolazione, String marca, String alimentazione, int cilindrata, int capacitaCarico) {
		super(annoImmatricolazione, marca, alimentazione, cilindrata);
		
		this.capacitaCarico = capacitaCarico;
	}
	
	public int getCapacitaCarico() {
		return capacitaCarico;
	}
	
	public void setCapacitaCarico(int capacitaCarico) {
		this.capacitaCarico = capacitaCarico;
	}
	
	public String toString() {
		return "Furgone " + getMarca() + " " + getAnnoImmatricolazione() + " alimentato a "+ getAlimentazione() + " cilindrata " + getCilindrata() + " con capacità carico pari a " + getCapacitaCarico();
	}
}
