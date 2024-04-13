
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car("Dacia","Logan",2022);
//		System.out.println(car.getAn());
		car.setModel("Spring");
		car.setAn(2023);
		System.out.println(car.getFabricant()+ "\n" + car.getModel()+ "\n" + car.getAn());
		
		Car car2=new Car("Porsche","911 Turbo S",2012);
		System.out.println(car2.getFabricant()+ "\n" + car2.getModel()+ "\n" + car2.getAn());
		
		
	// Acum o sa vreau sa copiez atributele unui obiect in alt obiect 
		
		System.out.println(car);
		System.out.println(car2);
		
		// se poate observa ca adresa obiectului este diferita acum este nevoie de a crea o metoda copy in clasa Car
		
		car.copy(car2);
		System.out.println(car);
		System.out.println(car2);
		
		// se observa ca dupa apelarea metodei copy adresa obiectului ramane neschimbata
		
		System.out.println(car.getFabricant()+ "\n" + car.getModel()+ "\n" + car.getAn());
		
		System.out.println(car2.getFabricant()+ "\n" + car2.getModel()+ "\n" + car2.getAn());
	
		Car car3=new Car(car2);
		System.out.println(car3.getFabricant()+ "\n" + car3.getModel()+ "\n" + car3.getAn());
		System.out.println(car);
		System.out.println(car2);
		System.out.println(car3);
		
		// se observa ca toate obiectele au adrese diferite dar atributele lafel
		
		}
	

}
