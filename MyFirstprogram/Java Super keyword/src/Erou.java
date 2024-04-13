
public class Erou extends Persoana{
	String putere;
	
	Erou(String nume,int varsta, String putere){
		super(nume,varsta);
		this.putere=putere;
		
	}
	public String toString() {
		return super.toString() + "\n" +this.putere;
}
}

