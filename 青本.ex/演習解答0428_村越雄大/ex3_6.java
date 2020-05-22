import java.util.Scanner;
class ex3_6{
	public static void main(String[]args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数:");
		int a=stdIn.nextInt();
		if(a>0&&a%10==0)
		System.out.println("その値は10の倍数です。");
		else if(a>0&&a%10>=1)
		System.out.println("その値は10の倍数ではありません。");
		else 
		System.out.println("正ではない値が入力されました。");
	}
}