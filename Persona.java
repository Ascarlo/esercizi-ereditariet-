package febbraio;
//17/2/2023
public class Persona {
	protected String Nome;
	
	public Persona() {
		
	}
	public Persona(String NomeIniziale) {
		
		Nome = NomeIniziale;
	}
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String NomeIniziale) {
		Nome = NomeIniziale;
	}
	
	public String toString() {
		return "La persona si chiama: " + Nome;
	}
	
	public boolean StessoNome(String nome) {
		
		if (Nome.equals(nome)) {
			
			return true;
		}
		else {
			
			return false;
		}
		
	}
	
}
