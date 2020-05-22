
import java.util.Scanner;
import java.util.Random;
class ex6_4{
	public static void main(String[]args){
		Random rand=new Random();
		Scanner stdin=new Scanner(System.in);
		System.out.print("óvëfêî:");
		int n=stdin.nextInt();
		int []a=new int[n];
		for (int i=0;i<n;i++)
		a[i]=1+rand.nextInt(10);
		int l=10;
		for(int j=0;j<10;j++){
			for(int k=0;k<n;k++){
				if(a[k]>=l)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			
			System.out.println();
			l--;
		}
		for(int d=0;d<n;d++){
			if(d>0)
			System.out.print("--");
			else
			System.out.print("-");
			
		}
		System.out.println();
		for(int d=0;d<n;d++)
		System.out.print((d%10)+" ");
	}
}