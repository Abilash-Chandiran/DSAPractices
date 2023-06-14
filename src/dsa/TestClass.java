package dsa;

public class TestClass {

	int x = 3;

	public static void main(String[] args) {
		
		new TestClass().m01();
	}

	void m01() {
		int x = 0;
		m02(++x);
	}

	void m02(int y) {
		int x = ++y;
		System.out.println(x);
	}

}
