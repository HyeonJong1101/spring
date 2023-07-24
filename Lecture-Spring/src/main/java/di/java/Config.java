package di.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages= {"di.java"}) //bean을 자동으로 만들려고 사용
@Configuration
public class Config {
	
	/*
	@Bean
	public Car car() {
		return new Car();
	}
	
	@Bean
	public Tire hankookTire() {
		return new HankookTire();
	}
	
	@Bean(name="kumho")
	public Tire kumhoTire() {
		return new KumhoTire();
	}*/
	
	
}
