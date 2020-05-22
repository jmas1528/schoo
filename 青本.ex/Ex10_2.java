import java.util.Scanner;
public class Ex10_2 {
		
	static int counter=0;

	private int id;

	public Ex10_2(int n) { 
		if (n==1) {
		id=++counter;
		}else
			id=counter+n;
		
		
	}
	
    

	public int getId() {
			
			return  id;
		}
		
	

	public static int getMaxId() {
		return counter;
	}

	}



