import java.util.Scanner;
class ex3_14{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("整数A");
		int a=stdin.nextInt();
		System.out.print("整数B");
		int b=stdin.nextInt();
		
		if(a-b==0)
		System.out.println("二つの値は同じです。");
	}
}