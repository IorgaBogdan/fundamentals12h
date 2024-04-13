import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		// exception = 	an event that occurs during the execution of a program that,
		//				disrupts the normal flow of instructions
		
		Scanner scanner=new Scanner(System.in);
		
		
		try{
			System.out.println("Numarul care vrei sa il divizi");
			System.out.print("X = ");
			int x=scanner.nextInt();
			System.out.println("Numarul la care vrei sa il divizi pe numarul de mai sus");
			System.out.print("Y = ");
			int y=scanner.nextInt();
			int z= x/y;
			System.out.println("Reszultatul este " + z);
			
			}
		catch(ArithmeticException e) {
			System.out.println("Este imposibil sa impartim la 0 !!!");
		}
		catch(InputMismatchException e) {
		System.out.println("Nu ai folosit cifre !!!");
		}
		catch(Exception e) {
			System.out.println("Nu ai folosit cifre !!!");
			}
		finally {
			scanner.close();
		}

	}

}
