package main.java.mandatoryHomeWork.week11.day4;

//https://www.hackerrank.com/challenges/save-the-prisoner/problem?isFullScreen=true
	//pseudocode
	// position = 2+s-1
  // 2 = c/9 >> c%9 >> reminder = 2
  // ifposition>prisonerthen s .. position % prisioner
  // if s == o return prisoner
	//else retunr s

public class PrisonersCandy {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 4, m= 6, s=2;
		PrisonersCandy returnCandy = new PrisonersCandy();
		System.out.println(returnCandy.candyPosition(n, m, s));
	}
	
	private  int candyPosition(int n, int m, int s) {
		int reminder=0, position=0, sol=0;
	    reminder = m%n;
	    position = reminder+s -1; 
	    sol = position%n;
	    if (sol == 0) {
	        return n;    
	    } 
	    return sol;
	}

}
