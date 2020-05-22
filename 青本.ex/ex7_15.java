import java.util.Scanner;
import java.util.Random;
public class ex7_15 {
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
		int sum=sum0f(a);
		System.out.printf("‡Œv‚Í%d‚Å‚·",sum);
	}
	static int sum0f(int[]a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
		}
		
	}

