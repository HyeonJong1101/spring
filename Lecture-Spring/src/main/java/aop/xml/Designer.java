package aop.xml;

public class Designer implements Employee{
	
	@Override
	public void work() {
		System.out.println("디자인 시안 및 수정을 합니다");
	}
}
