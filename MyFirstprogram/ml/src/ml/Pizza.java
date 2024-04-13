package ml;

public class Pizza {
	String coca;
	String toping1;
	String toping2;
	String toping3;
	
	Pizza(){ 
	}
	
	Pizza(String coca){
		this.coca=coca;
		this.toping1=toping1;
	}
	
	Pizza(String coca,String toping1){
		this.coca=coca;
		this.toping1=toping1;
	}
	
	Pizza(String coca,String toping1,String toping2){
		this.coca=coca;
		this.toping1=toping1;
		this.toping2=toping2;
	}
		
	Pizza(String coca,String toping1,String toping2,String toping3){
		this.coca=coca;
		this.toping1=toping1;
		this.toping2=toping2;
		this.toping3=toping3;
	}
}
