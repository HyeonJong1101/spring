package aop.pojo;

public class EmpMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Programmer();
		emp1.work();
		
		Employee emp2 = new Designer();
		emp2.work();
	}
}
