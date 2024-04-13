import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Animal animal;
		System.out.println("Ce animal doresti sa cream?");
		System.out.print("Pentru a alege caine apasa 1 pentru pisica alege 2: ");
		int x = scanner.nextInt();
		
		if( x  == 1 ) {
			animal = new Dog();
			animal.speak();
			
		}
		else if( x  == 2 ) {
			animal = new Cat();
			animal.speak();
			
		}
		else {
			
			animal = new Animal();
			System.out.println("Alegerea nu este corecta");
			animal.speak();
			
		}
	}

}
