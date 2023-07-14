package main.java.mandatoryHomeWork.week8.day4;

//https://www.hackerrank.com/challenges/mars-exploration/problem?isFullScreen=true

public class MarsExploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marsExplore();
	}

	public static void marsExplore() {
		String s="SOSSOS";
		String base="SOS";
		int j=1;
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=base.charAt(j-1)) {
				count++;
			}
			if(j<3) {
			j++;
			}
			else {
				j=1;
			}
		}
		
		System.out.println(count);

	}
}
