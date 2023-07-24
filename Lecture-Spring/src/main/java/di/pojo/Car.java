package di.pojo;

public class Car {
	
	private Tire tire;
	
	
	//���������� ���1
	public Car(Tire tire) {
		this.tire = tire;
		//tire = new KumhoTire();
		//tire = new HankookTire();
	}

	//���������� ���2
	public Car() {
		
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	

	public void printTireBrand() {
		System.out.println("���� Ÿ�̾� : "+tire.getBrand());
	}
}
