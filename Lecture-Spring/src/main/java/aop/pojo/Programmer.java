package aop.pojo;

public class Programmer implements Employee{

	@Override
	public void work() {
		//Action.gotoOffice();
		System.out.println("소프트웨어 개발을합니다");
		//Action.getoffOffice();
	}
}
