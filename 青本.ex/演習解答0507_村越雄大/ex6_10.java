import java.util.Scanner;
import java.util.Random;
class ex6_10{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("—v‘f”:");
		int n=stdin.nextInt();
		int []a=new int[n];
		for (int i=0;i<n;i++)
		a[i]=rand.nextInt(10)+1;
		
		for (int i=0;i<n;i++){
			if (i==0){
		a[i]=rand.nextInt(10)+1;
		
			}
			if (i!=0&&a[i]==a[i-1])
			a[i]=rand.nextInt(10)+1;
		}
				System.out.print("{");
					for(int i=0;i<n;i++){
						if(i<n-1)
					System.out.print(a[i]+",");
						else if(i==n-1)
					System.out.print(a[i]);
				}
					System.out.print("}");
				
	}
		}
		
