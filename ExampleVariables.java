package curs1;

public class ExampleVariables {
	
	String prenume = "Oana";//instance variable -- am nevoie de un obiect al clasei pentru a o accesa
	
	static String greetings = "Numele meu este : ";
	
	//metoda main - metoda principala de executie
	public static void main(String[] args) {
		
		// obiectul clasei care imi permite sa accesez variabilele si metodele din clasa respectiva
		ExampleVariables numeObiect = new ExampleVariables();	
	
		
		//sysout
		System.out.println(numeObiect.prenume);
		
		numeObiect.printNume();
		
		System.out.println(greetings);
		
	}
	
	public void printNume() {
		String nume = "Ion";//local variable (definita intre acoladele clasei)
		System.out.println(nume + prenume);
	}

}
