import java.util.Scanner;
class ex3_16{
	public static void main(String[]args){
	Scanner stdin=new Scanner(System.in);
	System.out.print("整数A:");
	int a=stdin.nextInt();
	System.out.print("整数B:");
	int b=stdin.nextInt();
	System.out.print("整数C:");
	int c=stdin.nextInt();
	
	if(a>b){
		int d=a;
		a=b;
		b=d;
	}
		if (b>c){
			int e=b;
			b=c;
			c=e;
		}
		if (a>b){
			int f=a;
			a=b;
			b=f;
		}
		System.out.println("3つの整数値を昇順に並べました。");
		System.out.println("結果は"+a+","+b+","+c+"です。");
	}
}
		