import java.util.Scanner;
class ex6_5{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("要素数:");
		int n=stdin.nextInt();
		int []a=new int[n];
		
		System.out.println("要素をうちこもう");
		for (int i=0;i<n;i++){
			System.out.print((i+1)+"番目の要素:");
			a[i]=stdin.nextInt();
		}
		for (int i=0;i<n;i++){
			if (i==0)
			System.out.print("{"+a[i]);
				else if(i!=0&&i!=n-1)
				System.out.print(","+a[i]);
				else if(i==n-1)
				System.out.println("."+a[i]+"}");
			
		}
		}
}
			