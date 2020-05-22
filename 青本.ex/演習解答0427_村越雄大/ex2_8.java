import java.util.Random;
import java.util.Scanner;
class ex2_8{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数値:");
		int a=stdIn.nextInt();
		Random rand= new Random();
		int l=rand.nextInt(11)-5;
		System.out.println("整数値"+a+"の+-5の乱数を生成しました。");
		System.out.println("それは"+(l+a)+"です。");
	}
}
		