import java.util.Scanner;
import java.util.Random;
public class ex7_16 {
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
		int min=min0f(a);
		System.out.printf("Å¬’l‚Í%d‚Å‚·",min);
	}
	static int min0f(int[]a) {
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(min>a[i])
				min=a[i];
		}
		return min;
		}
		
	}




