package ml;

public class Car {
		String make = "Ford";
		String model = "Mustang";
		String fuel = "Petrol";
		String color = "Black";
		int year = 2023;
		
		 public String toString(){
			String myString = make + "\n" + model + "\n" + fuel+ "\n"+ color + "\n" +year;
			return myString;
			
			
			//return make + "\n" + model + "\n" + fuel+ "\n"+ color + "\n" +year; // o alta metoda de a scrie return ul intr-o singura linie de cod 
			
			
		}
}
