package corejava;
import java.util.Scanner;
public class Area_of_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner n=new Scanner(System.in);
     double base,hight,area;
     System.out.println("ENter the base");
     base=n.nextDouble();
     System.out.println("ENter the Hight");
     hight=n.nextDouble();
     area= 0.5*base*hight;
     
     
     System.out.println("The area is :"+area);
         
     
     
     
	}

}
