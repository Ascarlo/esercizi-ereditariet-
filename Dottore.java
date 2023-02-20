package febbraio;

public class Dottore extends Persona{
	
	private String Specializzazione;
	private double Parcella;
	
	public Dottore (String nome, String specializzazione, double parcella) {
		super (nome);
		Specializzazione = specializzazione;
		Parcella = parcella;
	}
	
	public Dottore() {
		
	}

	public String getSpecializzazione() {
		return Specializzazione;
	}

	public void setSpecializzazione(String specializzazione) {
		Specializzazione = specializzazione;
	}

	public double getParcella() {
		return Parcella;
	}

	public void setParcella(double parcella) {
		Parcella = parcella;
	}

	public String toString() {
		return "Nome dottore: " + Nome + " \nSpecializzazione: " + Specializzazione + " \nParcella: " + Parcella;
	}
	
	public boolean isEqual (Dottore oggetto1, Dottore oggetto2) {
		
		if (oggetto1.getNome().equals(oggetto2.getNome()) && oggetto1.getSpecializzazione().equals(oggetto2.getSpecializzazione())
				&& oggetto1.getParcella() == oggetto2.getParcella()){
			
			return true;
		}
		else{
			
			return false;
		}
	}	
}