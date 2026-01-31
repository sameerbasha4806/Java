package inheritance;

class Bicycle{
	String tyre;
	String brake;
	String handle;
	String disc;
	
	public Bicycle(String tyre,String brake,String handle, String disc) {
		this.tyre=tyre;
		this.brake=brake;
		this.handle=handle;
		this.disc=disc;
		System.out.println("bicycle object created");
	}
	
	public void applyingBrakes() {
		System.out.println("Bicycle stopped moving");
		
	}
}

class Bike extends Bicycle{
	String engine;
	String headlight;
	String mileage;
	public Bike(String tyre, String brake, String handle, String disc, String engine, String headlight,
			String mileage) {
		super(tyre, brake, handle, disc);
		this.engine = engine;
		this.headlight = headlight;
		this.mileage = mileage;
		System.out.println("bike object created");
	}
	public void applyingBikeBrakes() {
		System.out.println("Bike Stopped Moving");
	}
	
	
}

public class Example2 {

	public static void main(String[] args) {
	Bike b=	new Bike("Mrf","disc brakes","cafe rider","abs disc","3000hrspowerengine","led","37");
     System.out.println(b.brake);
	}

}
