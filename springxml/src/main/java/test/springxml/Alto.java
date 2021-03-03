package test.springxml;

public class Alto implements Car {
	private int milage;
	
	public void setMilage(int milage) {
		this.milage = milage;
	}



	public void start() {
		System.out.println("Alto Starting...with milage: "+milage);

	}

}
