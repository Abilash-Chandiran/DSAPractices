package dsa;

public class SlidingwindHash {

	public static void main(String[] args) {
		
		String s = "xyzzac"; //xyz, yzz, zza, zac
		int k = 3;
		slidingwithHash(s, k);
	}
	
	private static void slidingwithHash(String s,int k) {
		
		int right = 0, left = 0;
		String goodStr = "";
		
		while(right<k) {

			goodStr = goodStr + s.charAt(right);	
			right++;
		}
		System.out.println(goodStr);
		
		while(right<s.length()) {
			left++;
			right++;
			goodStr = s.substring(left, right);
			System.out.println(goodStr);
			
		}
		

		
	}

}
