import java.util.Scanner;
class ex6_5{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("�v�f��:");
		int n=stdin.nextInt();
		int []a=new int[n];
		
		System.out.println("�v�f������������");
		for (int i=0;i<n;i++){
			System.out.print((i+1)+"�Ԗڂ̗v�f:");
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
			