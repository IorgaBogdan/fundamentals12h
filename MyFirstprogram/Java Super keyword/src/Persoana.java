
public class Persoana {
	String nume;
	int varsta;
	Persoana(String nume,int varsta){
		this.nume=nume;
		this.varsta=varsta;
	}
	public String toString() {
		return this.nume + "\n"+ this.varsta;
	}
}
