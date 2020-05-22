import java.util.Scanner;
class ex4_21_3{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		
		System.out.println("右上側直角の三角形を出力します");
		System.out.print("段数:");
		int a= stdin.nextInt();
		for(int b=a;b>0;b--){
			for(int d=0;d<=a-b;d++)
			System.out.print(" ");
			for(int c=b;c>0;c--)
				System.out.print("*");
		
			System.out.println();
		}
	}
}