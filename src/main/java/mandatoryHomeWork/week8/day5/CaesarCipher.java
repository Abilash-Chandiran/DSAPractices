package main.java.mandatoryHomeWork.week8.day5;

//https://www.hackerrank.com/challenges/caesar-cipher-1/problem?isFullScreen=true

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(caesarCipher());
	}

	public static String caesarCipher() {
		String s= "middle-Outz";
		int k=11;
		StringBuilder sb = new StringBuilder();
	    while(k >= 27) k = k - 26;
	    for(int i=0; i<s.length(); i++){
	        char c = s.charAt(i);
	        if(c>64 && c<91 || c>96 && c<123){            
	            int a = c+k;
	            if((c>64 && c<91) && (a>90)) sb.append((char)(a-26));
	            else if((c>96 && c<123) && (a>122)) sb.append((char)(a-26));
	            else sb.append((char)(c+k));
	        }
	        else sb.append(c);
	    }
	    return sb.toString();
	}
}
