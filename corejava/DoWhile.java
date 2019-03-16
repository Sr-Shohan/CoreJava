package corejava;

public class DoWhile {

	public static void main(String[] args) {
		int number =0;
		System.out.println("While loop sTarting:");
		while( number<=2) {
			System.out.println(number);
			number =number+1;
		}
		System.out.println("While loop done");
		
		
		System.out.println("do while loop starting:");
		int number1 =0;
		do {
			System.out.println(number1);
			number1=number1+1;
		}
		while(number1<=2);
        System.out.println("While loop done"); 
	}

}
