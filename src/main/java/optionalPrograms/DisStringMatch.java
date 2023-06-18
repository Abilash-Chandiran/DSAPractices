package main.java.optionalPrograms;

public class DisStringMatch {
	/**
	 * 
	 * Take String count using length I -> ++(Increment from min len value)
	 *  D -> --(Decrement from max len value)
	 * 
	 */

	public static void main(String[] args) {

		String s = "IDID";
		stringMatch(s);
	}

	public static void stringMatch(String s) {

		int len = s.length();
		int lenMax = s.length();
		int op[] = new int[len];
		int index=0;
		
		for(int i=0;i<len;i++) {
			
			if(s.charAt(i)=='I')
				op[i]=index++;
			else
				op[i]=lenMax--;
			
			System.out.println("op == "+op[i]);
		}
		
		

	}

}
