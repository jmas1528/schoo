import java.util.Scanner;
class ex3_15{
	public static void main(String[]args){
	Scanner stdin=new Scanner(System.in);
	System.out.print("整数A:");
	int a=stdin.nextInt();
	System.out.print("整数B:");
	int b=stdin.nextInt();
	if (a<=b){
		int c=a;
		a=b;
		b=c;
	}
		System.out.println("a>=bとなるようにソースしました。");
		System.out.println("変数aは"+a+"です。");
		System.out.println("変数bは"+b+"です。");
	}
}
		