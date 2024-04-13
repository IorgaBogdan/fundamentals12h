
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// polymorphism = greek word for poly="many", morph-"form"
		// The ability of an object to identify as more than one type
		
		Masina masina1=new Masina();
		Bicicleta bicicleta1=new Bicicleta();
		Barca barca1=new Barca();
		
		Vehicule[] participantilacursa = {masina1,bicicleta1,barca1};
		
//		masina1.go();
//		bicicleta1.go();
//		barca1.go();
		
		for(Vehicule x: participantilacursa ) {
			x.go();
		}
	}

}
