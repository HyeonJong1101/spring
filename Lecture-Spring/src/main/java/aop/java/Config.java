package aop.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"aop.java"})
@Configuration
public class Config {
/*
	@Bean
	public Action action() {
		return new Action();
	}
	
	@Bean
	public Programmer programmer() {
		return new Programmer();
	}
	
	@Bean
	public Designer designer() {
		return new Designer();
	}
	*/
}
