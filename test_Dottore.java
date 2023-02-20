package febbraio;
import java.util.Scanner;

public class test_Dottore {
	
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		Dottore oggetto1 = new Dottore("Marco Rossi", "ortopedia", 70.5);
		
		System.out.print("inserisci il nome del dottore: ");
		String nome = y.nextLine();
		System.out.print("inserisci la specializzazione del dottore: ");
		String specializzazione = y.nextLine();
		System.out.print("inserisci la parcella del dottore: ");
		double parcella = x.nextDouble();
		
		Dottore oggetto2 = new Dottore(nome, specializzazione, parcella);
		System.out.println("\n");
		System.out.println(oggetto1.toString());
		System.out.println(oggetto2.toString());
		
		if (oggetto1.isEqual(oggetto1, oggetto2)) {
			
			System.out.println("i due dottori sono uguali");
		}
		else {
			System.out.println("i due dottori non sono uguali");
		}
	}
}