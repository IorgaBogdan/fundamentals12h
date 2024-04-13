
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car("Dacia","Logan",2022);
//		System.out.println(car.getAn());
		car.setModel("Spring");
		car.setAn(2023);
		System.out.println(car.getFabricant()+ "\n" + car.getModel()+ "\n" + car.getAn());
	}

}
