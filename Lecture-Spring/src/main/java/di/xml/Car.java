package di.xml;

public class Car {

	private Tire tire;

	public Car() {
		System.out.println("������ ȣ��...");
	}

	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("������ ����");
	}
	
	public Car(Tire tire, Tire tire2) {
		this.tire = tire;
		System.out.println("������ ����");
	}
	
	public Car(Tire tire, String msg) {
		System.out.println("tire String ������ ����");
	}

	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setter����...");
	}

	public void printTireBrand() {
		System.out.println("���� Ÿ�̾� : " + tire.getBrand());
	}
}