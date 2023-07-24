package di.pojo;

public class DIMain {

	public static void main(String[] args) {
		
		HankookTire han = new HankookTire();
		KumhoTire kum = new KumhoTire();
		
		//Car car = new Car(han); //��������1
		Car car = new Car(kum); 
		car.printTireBrand();

		
		//��������2 --> �̰� spring���� �ٲٴ°���
		Car car2 = new Car();
		car2.setTire(han);
		car2.printTireBrand();
	}
}

