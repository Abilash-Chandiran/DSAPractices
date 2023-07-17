package main.java.seleniumpractice;

public class Class3 extends Class2{

	public static void main(String[] args) 
	{ 
	// Create an object of class Q and call the instance variable using reference variable q. 
		   Class2 q = new Class2();
		   System.out.println(" Value of a: " +q.a); // 'a' of Q is called. 

		// Declare superclass reference is equal to the child class object. 
		   Class1 p = new Class2();
		   System.out.println("Value of a: " +p.a); // 'a' of P is called. 
	  } 
	
}
