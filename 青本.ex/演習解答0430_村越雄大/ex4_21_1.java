import java.util.Scanner;
class ex4_21{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		
		System.out.println("左上側直角の三角形を出力します");
		System.out.print("段数:");
		int a= stdin.nextInt();
		for(int b=a;b>=1;b--){
			for(int c=b;c>=1;c--)
				System.out.print("*");
			System.out.println();
		}
	}
}