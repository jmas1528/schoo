import java.util.Scanner;
class ex3_12{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("整数A:");int a=stdin.nextInt();
		System.out.print("整数B:");int b=stdin.nextInt();
		System.out.print("整数C:");int c=stdin.nextInt();
		int min=a;
		if (b<min)min=b;
		if (c<min)min=c;
		System.out.println("最小値は"+min+"です。");
	}
}