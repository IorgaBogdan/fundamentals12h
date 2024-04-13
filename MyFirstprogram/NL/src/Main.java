public class Main{


public static void main(String[] args){


	
	Food food1 = new Food("Pizza");		//Aceste linii de cod creează trei instanțe ale clasei Food, fiecare inițializată cu un nume diferit ("Pizza", "Hamburger", și "Hotdog").
	Food food2 = new Food("Hamburger");
	Food food3 = new Food("Hotdog");
	
//	Varianta 1 de declarare
	
//	Food[] refrigerator = new Food[3]; // cream array -ul refrigerator // Food este clasa
//	
//	refrigerator[0]=food1;
//	refrigerator[1]=food2;
//	refrigerator[2]=food3;
	
//	Varianta 2 de atribuirea a obiectelor pentru Array
	Food[] refrigerator = {food1,food2,food3};
	
	System.out.println(refrigerator[0]);	
	System.out.println(refrigerator[1].name);	
	System.out.println(food3.name);	
}
}


