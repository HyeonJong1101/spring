package di.anno;

import org.springframework.stereotype.Component;

@Component("hankook")
public class HankookTire implements Tire{

	@Override
	public String getBrand() {
		return "한국타이어";
	}
}
