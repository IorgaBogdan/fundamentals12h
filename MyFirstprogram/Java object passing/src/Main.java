
public class Main {

	public static void main(String[] args) {
		Garage garage= new Garage();
		
		Car car1=new Car("BMW");
		Car car2=new Car("Tesla");
		
		Bicicleta bicicleta1=new Bicicleta("Giant");
		
		garage.park(car1,bicicleta1);
		garage.park(car2);
	}

}
