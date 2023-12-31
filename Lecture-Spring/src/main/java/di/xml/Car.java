package di.xml;

public class Car {

	private Tire tire;

	public Car() {
		System.out.println("생성자 호출...");
	}

	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("생정자 주입");
	}
	
	public Car(Tire tire, Tire tire2) {
		this.tire = tire;
		System.out.println("생정자 주입");
	}
	
	public Car(Tire tire, String msg) {
		System.out.println("tire String 생성자 주입");
	}

	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setter주입...");
	}

	public void printTireBrand() {
		System.out.println("장착 타이어 : " + tire.getBrand());
	}
}
