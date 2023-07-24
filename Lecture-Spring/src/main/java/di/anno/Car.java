package di.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	@Qualifier("kumho")
	private Tire tire;

	
	public Car() {
		System.out.println("������ ȣ��...");
	}

	
	//@Autowired
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("������ ����");
	}
	
	@Autowired
	public Car(@Qualifier("hankook") Tire tire, @Qualifier("kumho") Tire tire2) {
		this.tire = tire;
		System.out.println("������ ����2");
		System.out.println(tire.getBrand());
		System.out.println(tire2.getBrand());
	}
	
	
	public Car(Tire tire, String msg) {
		System.out.println("tire String ������ ����");
	}

//	@Autowired
//	@Qualifier("hankook")
	
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setter����...");
	}

	public void printTireBrand() {
		System.out.println("���� Ÿ�̾� : " + tire.getBrand());
	}
}