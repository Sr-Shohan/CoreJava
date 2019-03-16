package corejava;

import java.util.Scanner;

public class VowelCheck {

	private static Scanner i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		i = new Scanner(System.in);
		
		
		char ch;
		ch=i.next().charAt(0);
		if(ch=='a') 
			System.out.println("Vowel");
		else
			System.out.println("not vowel");
			
		
	}

}
