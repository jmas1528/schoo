import java.util.Scanner;
import java.util.Random;
class ex6_9{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("—v‘f”:");
		int n=stdin.nextInt();
		int []a=new int[n];
		
		for (int i=0;i<n;i++){
		a[i]=rand.nextInt(10)+1;
		System.out.println("a["+(i)+"]‚Ì’l:"+a[i]);
		}
	}
}