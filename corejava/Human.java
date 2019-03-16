package corejava;

public class Human {
	char gender;//f for female and m for male 
	String firstname,lastname;
	int nid;
	
	
	Human partner;
	
	
	public void speak(String word) {
		System.out.println(word);
	}
	
	public void setId(int id ) {
		nid=id;
	}
	public int getid() {
		return nid;
	}
    public String getfullname() {
    	return this.firstname +" " +this.lastname;
    }
	
	
	
	
	

	public static void main(String[] args) {
		
		Human connie=new Human();
		connie.setId(23145);
	   System.out.println();
		

	}

}
