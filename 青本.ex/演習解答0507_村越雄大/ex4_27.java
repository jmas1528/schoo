import java.util.Random;
import java.util.Scanner;
class ex4_27{
	public static void main(String[]args){
	Random rand=new Random();
	Scanner stdin=new Scanner(System.in);
	int a=rand.nextInt(100);
	System.out.println("数当てゲーム開始");
	System.out.println("0～99の数を当ててください。");
	int b=100;
	Outer:
		
		for (int i=10;i>0;i--){
			System.out.println("後"+i+"回！");
		System.out.print("いくつかな？:");
		b=stdin.nextInt();
			
			if (b==a){
			System.out.println("正解です!");
			break Outer;
			}
			else if (i==1&&b!=a){
			System.out.println("正解は"+a+"でした。");
			break Outer;
			}
			 
			else if(b<a&&i!=1){
		System.out.println("もっと大きい数だよ。");
			}
			else if (b>a&&i!=1){
		System.out.println("もっと小さい数だよ。");
			}
			}
		}
}
	
		
