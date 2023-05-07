package dsaWeek2Day3;
import java.util.HashMap;
import java.util.Map;

public class FindHexadecimal {

	public static void main(String[] args) {
	
		intToHexadecimal();
	}
	
	
	public static void intToHexadecimal() {
		
		int num = 47;
		String hexadecimal = "";
		char hc[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		
		while(num>0) {
			
			int temp = 47%16;
			hexadecimal = hc[temp]+hexadecimal;
			num = num/16;
		}
		
		System.out.println(hexadecimal);
		
		
		
	}

}
