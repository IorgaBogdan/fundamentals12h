
public class Persoana {
	String nume;
	int varsta;
	double inaltime;
	
	Persoana(String nume, int varsta, double inaltime){
		this.nume=nume;
		this.varsta=varsta;
		this.inaltime=inaltime;
		
	}
	void bea() {
		System.out.println(this.nume + " bea apa.");
	}
	void mananca() {
		System.out.println(this.nume + " manaca mult");
	}
}
