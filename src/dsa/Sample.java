package dsa;

public class Sample {

	int i;
	public static void main(String[] args) {
		Sample s = new Sample();
		// System.out.println(s.i);
		javaHungry(null);
	}

	public static void javaHungry(String s) {
		System.out.println("String");
	}

	public static void javaHungry(Object o) {
		System.out.println("Object");
	}
	
}
