package corejava;
import java.util.Scanner;
public class Prime {


	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		int m,n,count=0,i,j;
		m=x.nextInt();
		n=x.nextInt();
		for(i=m;i<=n;i++){
			for(j=2;j<i;j++){
				if(i%j==0){
			
					}
					count++;
					break;
				}
			}
			
			if(count==0 && count!=1)
				System.out.printf("%d\n",i);
				count=0;
		
		
		}
	}
	