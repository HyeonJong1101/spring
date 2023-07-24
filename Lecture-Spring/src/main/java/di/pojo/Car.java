package di.pojo;

public class Car {
	
	private Tire tire;
	
	
	//의존성주입 방법1
	public Car(Tire tire) {
		this.tire = tire;
		//tire = new KumhoTire();
		//tire = new HankookTire();
	}

	//의존성주입 방법2
	public Car() {
		
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	

	public void printTireBrand() {
		System.out.println("장착 타이어 : "+tire.getBrand());
	}
}
