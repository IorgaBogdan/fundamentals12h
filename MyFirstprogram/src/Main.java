import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// for-each= traversing technique to iterate through the elements in an array/collection
//		 less steps, more readable
//		less flexible

//metoda una

		String[] animals = {"cat","dog","rat","bird"};
	
/*// metoda doi	

	ArrayList<String> animals = new ArrayList<String>();
	
	animals.add("Cat");
	animals.add("Dog");
	animals.add("Rat");
	animals.add("Bird");
	animals.add("Mouse");*/
		
	for(String i : animals) {
		System.out.println(i);
	}
		
	}

}
