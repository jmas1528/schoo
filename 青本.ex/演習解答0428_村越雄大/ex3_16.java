import java.util.Scanner;
class ex3_16{
	public static void main(String[]args){
	Scanner stdin=new Scanner(System.in);
	System.out.print("®”A:");
	int a=stdin.nextInt();
	System.out.print("®”B:");
	int b=stdin.nextInt();
	System.out.print("®”C:");
	int c=stdin.nextInt();
	
	if(a>b){
		int d=a;
		a=b;
		b=d;
	}
		if (b>c){
			int e=b;
			b=c;
			c=e;
		}
		if (a>b){
			int f=a;
			a=b;
			b=f;
		}
		System.out.println("3‚Â‚Ì®”’l‚ğ¸‡‚É•À‚×‚Ü‚µ‚½B");
		System.out.println("Œ‹‰Ê‚Í"+a+","+b+","+c+"‚Å‚·B");
	}
}
		