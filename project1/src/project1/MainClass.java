package project1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws InputException {
		System.out.println("Interfejs bankowy\n");
		System.out.println("Wprowadü liczbÍ dla operacji: ");		
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();		
		if(s.equals("1"))
				Przelew();
		else
			System.out.println("Koniec");
		
		
	}
	
	private static void Przelew() throws InputException{
		int nrKonta;
		int kwota;
		String tytul;
		String imie;
		String nazwisko;
		
	System.out.println("Zlecono przelew\nWprowadü numer konta:");
	Scanner nrk = new Scanner(System.in);
	String s = nrk.nextLine();
	if (s.matches("[0-9]+") == false) throw new InputException();
	else nrKonta = Integer.parseInt(s);
	System.out.println(nrKonta);
	
	System.out.println("\nWprowadü kwotÍ:");
	Scanner kw = new Scanner(System.in);
	String s2 = kw.nextLine();
	if (s2.matches("[0-9]+") == false) throw new InputException();
	else kwota = Integer.parseInt(s2);
	System.out.println(kwota);
	
	System.out.println("\nWprowadü imiÍ:");
	Scanner name = new Scanner(System.in);
	String s3 = name.nextLine();
	imie = s3;
	System.out.println(imie);
	
	System.out.println("\nWprowadü nazwisko:");
	Scanner surname = new Scanner(System.in);
	String s4 = surname.nextLine();
	nazwisko = s4;
	System.out.println(nazwisko);
	
	System.out.println("\nWprowadü tytu≥:");
	Scanner t = new Scanner(System.in);
	String s5 = t.nextLine();
	tytul = s5;
	System.out.println(tytul);
			
	}
}

class WrongDataException extends Exception{
	public WrongDataException(String msg) {
		super(msg);
	}
}

class InputException extends WrongDataException{
	public InputException() {
		super("B≥πd");
	}
}