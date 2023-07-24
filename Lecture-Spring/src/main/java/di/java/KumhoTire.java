package di.java;

import org.springframework.stereotype.Component;

@Component("kumho")
public class KumhoTire implements Tire{

	@Override
	public String getBrand() {
		return "금호타이어";
	}
}
