
public class Test1 {
	
	public static void main(String[] args) {
		String a="test";
		String b="test";
		String c = new String("test");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a=="test");
		System.out.println(a.equals(c));
	}
}
