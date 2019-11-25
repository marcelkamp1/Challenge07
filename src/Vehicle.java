
public abstract class Vehicle {
	
	// attributes
	private String brand;
	private int kilometers;
	
	// constructor
	public Vehicle(String brand) {
		this.setBrand(brand);
	}
		
	public Vehicle(String brand, int kilometers) {
		this.setBrand(brand);
		this.setKilometers(0);
	}
	
	// getter
	public String getBrand() {
		return brand;
	}
	
	public int getKilometers() {
		return kilometers;
	}
	
	// setter
	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	
	// methods
	public abstract String doStuff();
	
	
	
}
