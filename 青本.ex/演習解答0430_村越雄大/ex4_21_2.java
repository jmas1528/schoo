import java.util.Scanner;
class ex4_21_2{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		
		System.out.println("右下側直角の三角形を出力します");
		System.out.print("段数:");
		int a= stdin.nextInt();
		for(int b=a;b>0;b--){
			for(int d=b;d-1>0;d--)
			System.out.print(" ");
			for(int c=0;c<=a-b;c++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}