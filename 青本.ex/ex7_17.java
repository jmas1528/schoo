import java.util.Scanner;
import java.util.Random;
public class ex7_17 {
	public static void main(String[]args) {
		Scanner stdin=new Scanner(System.in);
		Random rand=new Random();
		
		System.out.print("—v‘f”:");
		int n=stdin.nextInt();
		int[]a=new int[n];
		
		for (int i=0;i<n;i++) {
		a[i]=rand.nextInt(10);
		}
		for(int i=0;i<n;i++) {
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		System.out.print("’T‚·”’l:");
		int b=stdin.nextInt();
		
		int x=linearSearch(a,b);
		if(b==-1) {
			System.out.print("‚»‚Ì”‚Í‘¶İ‚µ‚Ü‚¹‚ñB");
	}else {
			System.out.printf("‚»‚Ì”‚Í%d‚É‘¶İ‚µ‚Ü‚·B",b);
	}
	static int linearSearch(int[]a,int b) {
		
		for(int i=a.length;i>0;i--) {
			if(a[i-1]==b) {
				return i-1;    
		
		
		} 
		return -1;
		}
		
	}
	}
}


