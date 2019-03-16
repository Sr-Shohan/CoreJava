package corejava;

public class BranchingSta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Starting the conutdown:");
       
       for(int i=10;i>0;i--) {
    	   System.out.println(i);
    	   if(i>=4) {
    		   continue;
    	   }
    	   System.out.println("beep");   
       
       }
	}

}
