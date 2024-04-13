
public class Main {

	public static void main(String[] args) {
		
		// abstract =  	abstract classes cannot be instantiated, but they can have a subclass
		//				abstract methods are declared without an implementation
		
		//Vehicle vehicle = new Vehicle();  // Nu se poate instantia o clasă abstractă
		Car car = new Car();  // Se poate instantia o clasă derivată a clasei abstracte Vehicle
		
		car.go();  // Se apelează metoda go() din clasa Car
	}
}