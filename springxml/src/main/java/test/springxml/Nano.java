package test.springxml;

public class Nano implements Car {
	
	private int milage;

	public void setMilage(int milage) {
		this.milage = milage;
	}



	public void start() {
		System.out.println("Nano Starting...with milage: "+milage);

	}

}
