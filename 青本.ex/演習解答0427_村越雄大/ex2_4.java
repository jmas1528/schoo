import java.util.Scanner;
class ex2_4{
	public static void main(String[] args){
		Scanner stdIn =new Scanner(System.in);
		System.out.print("整数値:");
		int a = stdIn.nextInt();
		int b=a+10;
		int c=a-10;
		System.out.println(a+"に10を加えた数は"+b+"です。");
		System.out.println(a+"から10引いた数は"+c+"です。");
	}
}