package febbraio;
import  java.util.Scanner;

public class test_Dipendente {
	
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		Dipendente oggetto1 = new Dipendente("Vinicio Capossela", 652.5, 1983, "28374");
		
		System.out.print("inserisci il nome del dipendente: ");
		String nome = y.nextLine();
		System.out.print("inserisci la retribuzione del dipendente: ");
		double retribuzione = x.nextDouble();
		System.out.print("inserisci la pdata d'assunzione: ");
		int data_assunzione = x.nextInt();
		System.out.print("inserisci il codice identificativo: ");
		String id = y.nextLine();
		
		Dipendente oggetto2 = new Dipendente (nome, retribuzione, data_assunzione, id);
		
		System.out.println("\n");
		System.out.println(oggetto1.toString());
		System.out.println(oggetto2.toString());
		
		if (oggetto1.isEqual(oggetto1, oggetto2)) {
			
			System.out.println("i due dipendenti sono uguali");
		}
		else {
			System.out.println("i due dipendenti non sono uguali");
		}
	}
}