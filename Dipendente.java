package febbraio;
//17/2/2023
public class Dipendente extends Persona{
	
	private double Retribuzione;
	private int DataAssunzione;
	private String ID;
	
	public Dipendente() {
		
	}
	
	public Dipendente(String nome, double retribuzione, int dataAssunzione, String id) {
		
		super (nome);
		Retribuzione = retribuzione;
		DataAssunzione = dataAssunzione;
		ID = id;
	}

	public double getRetribuzione() {
		return Retribuzione;
	}

	public void setRetribuzione(double retribuzione) {
		Retribuzione = retribuzione;
	}

	public int getDataAssunzione() {
		return DataAssunzione;
	}

	public void setDataAssunzione(int dataAssunzione) {
		DataAssunzione = dataAssunzione;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String toString() {
		return "Nome dipendente: " + Nome + " Retribuzione: " + Retribuzione + ", DataAssunzione: " + DataAssunzione + ", ID: " + ID;
	}
	
	public boolean isEqual (Dipendente oggetto1, Dipendente oggetto2) {
		
		if (oggetto1.getNome().equals(oggetto2.getNome()) && oggetto1.getRetribuzione() == oggetto2.getRetribuzione()
				&& oggetto1.getDataAssunzione() == oggetto2.getDataAssunzione()
				&& oggetto1.getID().equals(oggetto2.getID())){
			
			return true;
		}
		else{
			
			return false;
		}
	}
}