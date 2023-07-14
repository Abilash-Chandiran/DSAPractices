package main.java.mandatoryHomeWork.week8.day4;

import java.util.HashSet;

//https://www.hackerrank.com/challenges/game-of-thrones/problem?isFullScreen=true

public class GameOfThrones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gameOfThrones());
	}

	public static String gameOfThrones() {
		String s="cdefghmnopqrstuvw";
		String output="";
        HashSet<Character> hs=new HashSet<Character>();
        for(int i=0; i< s.length();i++){
            if(hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
            }
            else {
            	hs.add(s.charAt(i));
            }
        }
      //  System.out.print(hs);
        if(hs.size()==0 || hs.size()==1){
            output="YES";
        }
        else{
            output="NO";
        }
        
        return output;
	}
}
