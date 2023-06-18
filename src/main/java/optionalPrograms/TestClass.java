package main.java.optionalPrograms;

public class TestClass {

	int x = 3;

	public static void main(String[] args) {
		
		//new TestClass().m01();
		
		TestClass test = new TestClass();
		String iAmOfAnArgumentativeNature = "I am born new";
		test.mi(iAmOfAnArgumentativeNature);
		System.out.println(iAmOfAnArgumentativeNature);
	}

	void m01() {
		int x = 0;
		m02(++x);
	}

	void m02(int y) {
		int x = ++y;
		System.out.println(x);
	}
	
	public void mi(String arg1) {
		
		arg1 = "I am going to disapper";
		
	}

}
