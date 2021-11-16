package veicoli;

public abstract class VeicoloAMotore {
	
	private int annoImmatricolazione;
	private String marca;
	private String alimentazione;
	private int cilindrata;
	private int numPosto;
	
	public VeicoloAMotore(int annoImmatricolazione, String marca, String alimentazione, int cilindrata) {
		this.annoImmatricolazione = annoImmatricolazione;
		this.marca = marca;
		this.alimentazione = alimentazione;
		this.cilindrata = cilindrata;
	}
	
	public int getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}
	
	public void setAnnoImmatricolazione(int annoImmatricolazione) {
		this.annoImmatricolazione = annoImmatricolazione;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getAlimentazione() {
		return alimentazione;
	}
	
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	
	public int getCilindrata() {
		return cilindrata;
	}
	
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public int getNumPosto() {
		return numPosto;
	}
	
	public void setNumPosto(int numPosto) {
		this.numPosto = numPosto;
	}
	
	public abstract String toString();
}

