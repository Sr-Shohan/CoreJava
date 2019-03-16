package corejava;
import java.util.Scanner;
public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in);
		int n;
		System.out.println("Enter The Number: ");
		n=input.nextInt();
		if(n>0)
			System.out.println("This is positive number");
		else 
			System.out.println("The number is negative");
		
		
	}

}
