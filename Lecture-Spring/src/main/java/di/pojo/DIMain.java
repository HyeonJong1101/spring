package di.pojo;

public class DIMain {

	public static void main(String[] args) {
		
		HankookTire han = new HankookTire();
		KumhoTire kum = new KumhoTire();
		
		//Car car = new Car(han); //의존주입1
		Car car = new Car(kum); 
		car.printTireBrand();

		
		//의존주입2 --> 이걸 spring으로 바꾸는거임
		Car car2 = new Car();
		car2.setTire(han);
		car2.printTireBrand();
	}
}

