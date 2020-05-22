import java.util.Scanner;
class ex3_5{
	public static void main(String[]args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数:");
		int a=stdIn.nextInt();
		if(a>0&&a%5==0)
		System.out.println("その値は5で割り切れます。");
		else if(a>0&&a%5>=1)
		System.out.println("その値は5で割り切れません。");
		else 
		System.out.println("正ではない値が入力されました。");
	}
}