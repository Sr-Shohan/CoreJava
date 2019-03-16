package corejava;
import java.util.Scanner;
public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double n,a,b;
		System.out.println("Enter the first number:");
		a=input.nextDouble();
		System.out.println("Enter the second number :");
		b=input.nextDouble();
		
		n=a+b;
		
		System.out.println("THe answe is = "+n);
		
		

	}

}
