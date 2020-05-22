import java.util.Scanner;
class ex5_5{
	public static void main(String[]args){
		Scanner stdin=new Scanner (System.in);
		System.out.println("3つの整数値を入力してください。\n合計値と平均値を求めます。");
		System.out.print("整数値a:");int a=stdin.nextInt();
		System.out.print("整数値b:");int b=stdin.nextInt();
		System.out.print("整数値c:");int c=stdin.nextInt();
		
		int sum=a+b+c;
		int ave=(a+b+c)/3;
		
		System.out.println("合計は"+sum+"平均は"+(double)ave+"です。");
	}
}