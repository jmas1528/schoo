import java.util.Scanner;
import java.util.Random;
class ex6_7{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		Random rand=new Random();
		
		final int n=12;
		int[]a =new int[n];
		for (int j=0;j<n;j++)
		a[j]=rand.nextInt(10);
			System.out.print("配列aの全要素の値\n{");
				
				for(int j=0;j<a.length;j++)
				System.out.print(a[j]+" ");
				System.out.println("}");
		System.out.print("探す数値:");
		int b=stdin.nextInt();
		
	int i;
		for(i=n-1;i>0;i--)
		if (a[i]==b)
		break;
		if(i<n)
			System.out.println("それはa{"+i+"}にあります.");
		else
		System.out.println("それはありません。");
	}
}
		 