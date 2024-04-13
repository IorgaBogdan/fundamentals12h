
public class Main {

	public static void main(String[] args) {
		// inhertance = the proces where one class acquires, the attributes and methods of another
		Masina masina1 = new Masina();
		masina1.oprit();	// aici se vede mostenirea deoarece am folosit metoda a clasei vehicule in obiectul "masina1" care apartine clasei  Masina
		masina1.mers();
		System.out.println(masina1.numardeusi); // aici trebuie sa fim atenti ca am incercat sa printez doar masina1.numardeusi si nu a mers *** fiind doar un atribuit al obiectului si nu o metoda trebuie apelata prin System.out.println
		
	}

}
