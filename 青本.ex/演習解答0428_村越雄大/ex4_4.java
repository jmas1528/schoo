import java.util.Scanner;
	class ex4_4{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.println("カウントダウン。");
		int a;
		do {
			System.out.print("正の整数値:");
			a=stdin.nextInt();
		}while (a<=0);
		while (a>=0){
			System.out.println(a);
			a--;
		}
		System.out.println(a);
	}
}