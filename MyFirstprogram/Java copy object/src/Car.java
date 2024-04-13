

public class Car {
	private String fabricant;
	private String model;
	private int an;
	
	Car(String fabricantINT, String modelINT , int anINT){
		this.setFabricant(fabricantINT);
		this.setModel(modelINT);
//		this.an=anINT;		// toate erau sub forma asta in constructor , in momentul in care folositm set se va modifica sub forma de mai jos
		this.setAn(anINT);
		
		
	}
	Car(Car y){
		this.copy(y);                       /// aici am creat un constructor overloaded unde putem copia un obiect din faza de crearea a altui obiect
	}
	public String getFabricant() {
		return fabricant;
	}

	public void setFabricant(String fabricant) {
		this.fabricant = fabricant;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public int getAn() {
		return an;
	}

	public void setAn(int an) {
		this.an = an;
	}
	public void copy(Car x) {
		this.setFabricant(x.getFabricant());
		this.setModel(x.getModel());
		this.setAn(x.getAn());
	}
}

