import java.util.Scanner;
public class ex7_9 {
	static Scanner stdin =new Scanner (System.in);
	
	static int readPlusInt() {
		System.out.print("³‚Ì®”’lF");
		int a=stdin.nextInt();
		return a;
		
	}
	public static void main(String[]args) {
		int b;
		do {
			b=readPlusInt();
		}while(b<=0);
		
	}
}
