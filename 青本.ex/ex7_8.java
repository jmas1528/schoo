import java.util.Scanner;
import java.util.Random;
public class ex7_8 {
	static int random(int a,int b) {
		Random rand=new Random();
		int c=rand.nextInt(b-a)+a;
		return c;
	}
	public static void main(String[]args) {
		Scanner stdin=new Scanner (System.in);
		System.out.println("aˆÈãb–¢–‚Ì—”‚ğo—Í‚µ‚Ü‚·B");
		System.out.print("®”a:");
		int a=stdin.nextInt();
		System.out.print("®”b:");
		int b=stdin.nextInt();
		if (b<a) {
			System.out.print(a);
		}else {
			int c=random(a,b);
			System.out.println(c);
		}
}
}