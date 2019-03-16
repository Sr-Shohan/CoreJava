package corejava;
import java.util.Scanner;
public class SimpleCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner n= new Scanner(System.in);
		int a,b,s,m,ad;
		System.out.println("Enter the first number: ");
		a=n.nextInt();
		System.out.println("ENter the second number: ");
		b=n.nextInt();
		
		s=a+b;
		m=a*b;
		ad=a-b;
		System.out.println("The answer is : "+s);
		System.out.println("The multiplecaation is : "+m);
		System.out.println("The addition is : "+ad);
		
		
		

	}

}
