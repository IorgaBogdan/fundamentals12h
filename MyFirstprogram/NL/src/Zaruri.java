import java.util.Random;

public class Zaruri {
	Zaruri(){
		Random randomizator = new Random();
		int numar = 0;
		aruncarezar(randomizator,numar);
		
	}
	void aruncarezar(Random randomizare, int numar) {
		numar = randomizare.nextInt(6)+1;
		System.out.println(numar);
		
	}
}
