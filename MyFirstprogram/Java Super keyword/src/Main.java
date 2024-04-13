
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Erou erou1=new Erou("Batman",33,"Cashflow");
		Erou erou2=new Erou("Superman",43,"muschii");
		Erou erou3=new Erou("Joker",332,"Raufacator");
		Persoana persoana1 = new Persoana("Miahi Andrei",23);
//		System.out.println(erou1.nume + "\n" +erou1.varsta + "\n" + erou1.putere );
//		System.out.println(erou2.nume + "\n" +erou2.varsta + "\n" + erou2.putere );
//		System.out.println(erou3.nume + "\n" +erou3.varsta + "\n" + erou3.putere );
		
		// pentru a efita scrierea de mai multe ori a comenzii in  System.out.println o sa adaucam o metoda in clasele persoana si erou (tostring)
	
	System.out.println(erou1.toString());
	System.out.println(persoana1.toString());
	
	// aici se observa ca apelez obiectul creat print metoda toString 
	}

}
