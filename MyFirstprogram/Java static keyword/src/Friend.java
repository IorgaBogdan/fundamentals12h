
public class Friend {
	String name;
	static int numberofFriends;
	
	Friend (String name){
		this.name=name;
		numberofFriends++;
	}
	static void printofNumberF(){
		System.out.println("Numarul de " + numberofFriends+ " prieteni este in sala de conferinta");
	}
}
