import java.util.Scanner;
class ex4_12{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.println("カウントダウンします。");
		int a;
		do{
			System.out.print("正の整数値:");
			a=stdin.nextInt();
		}while (a<=0);
		for(int b=0;b<=a;b++)
		System.out.println(b);
	}
}