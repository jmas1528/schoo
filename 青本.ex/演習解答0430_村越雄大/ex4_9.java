import java.util.Scanner;
class ex4_9{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		int a;
		do{
		System.out.print("正の整数値:");
		 a=stdin.nextInt();
		}while(a<=0);
		int b=1;
		int c=1;
		while(c<=a){
			b*=c;
			c++;
		}
		System.out.print("1から"+a+"までの積は"+b+"です。");
	}
}