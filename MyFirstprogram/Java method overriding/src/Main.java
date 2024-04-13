
public class Main {

	public static void main(String[] args) {
		// method overriding = Declaring a method in sub class, which is already present in parent	class. Done so that a child can give its own implementation.
		Animale animal=new Animale();
		Caini caine=new Caini();
		animal.vorbeste();
		caine.vorbeste();
	}

}
