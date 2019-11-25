public class Hangar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car kia = new Car("", 0);
		kia.setBrand("Kia");
		kia.setKilometers(25123);
		
		Boat titanic = new Boat("Titanic", 0);
		
		Car toyota = new Car("Toyota", 75000);
		
		Boat ussmarine = new Boat("USS Marine", 0);
		
		
		System.out.println(kia.doStuff());
		System.out.println(titanic.doStuff());
		System.out.println(toyota.doStuff());
		System.out.println(ussmarine.doStuff());
	}

}
