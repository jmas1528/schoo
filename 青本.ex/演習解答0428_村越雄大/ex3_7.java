import java.util.Scanner;
class ex3_7{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数値:");
		int a=stdIn.nextInt();
		if(a>0&&a%3==0)
		System.out.println("その値は3で割り切れます。");
		else if(a>0&&a%3==1)
		System.out.println("その値を3で割った余りは1です。");
		else if(a>0&&a%3==2)
		System.out.println("その値を3で割った余りは2です。");
		else
		System.out.println("正ではない値が入力されました。");
	}
}