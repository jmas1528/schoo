import java.util.Random;
import java.util.Scanner;
class ex4_2{
	public static void main(String[]args){
	Random rand=new Random();
	Scanner stdin=new Scanner(System.in);
	int a=rand.nextInt(89)+10;
	System.out.println("数当てゲーム開始");
	System.out.println("0～99の数を当ててください。");
	
	int b;
	do{
		System.out.print("いくつかな？:");
		b=stdin.nextInt();
		if(b<a)
		System.out.println("もっと大きい数だよ。");
	else if (b>a)
		System.out.println("もっと小さい数だよ。");
		}while(b!=a);
		System.out.println("正解です。");
	}
}